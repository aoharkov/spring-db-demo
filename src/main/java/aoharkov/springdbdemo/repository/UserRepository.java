package aoharkov.springdbdemo.repository;

import aoharkov.springdbdemo.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

    UserEntity findByEmail(String email);

}
