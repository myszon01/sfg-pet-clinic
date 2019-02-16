package myszon.springframework.sfgpetclinic.services.map;

import myszon.springframework.sfgpetclinic.model.Owner;
import myszon.springframework.sfgpetclinic.services.PetService;
import myszon.springframework.sfgpetclinic.services.PetTypeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    private OwnerServiceMap ownerServiceMap;

    final private Long ownerId =1L;
    final private String lastName ="Smith";

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(), new PetServiceMap());

        ownerServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findAll() {

        Set<Owner> ownerSet = ownerServiceMap.findAll();
        assertEquals(1, ownerSet.size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void saveExistingId() {
        Long id = 2L;

        Owner owner2 = Owner.builder().id(id).build();
        Owner savedOwner = ownerServiceMap.save(owner2);
        assertEquals(id, savedOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner saveOwner = ownerServiceMap.save(Owner.builder().build());
        assertNotNull(saveOwner);
        assertNotNull(saveOwner.getId());
    }

    @Test
    void findById() {
        assertEquals(ownerId, ownerServiceMap.findById(ownerId).getId());
    }

    @Test
    void findByLastName() {
       Owner owner = ownerServiceMap.findByLastName(lastName);
       assertNotNull(owner);
       assertEquals(ownerId,owner.getId());
    }

    @Test
    void findByLastNameNotFound() {
        Owner owner = ownerServiceMap.findByLastName("foo");
        assertNull(owner);
    }
}