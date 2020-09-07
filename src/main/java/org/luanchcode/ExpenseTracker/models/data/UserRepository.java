package org.luanchcode.ExpenseTracker.models.data;

import org.luanchcode.ExpenseTracker.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
