package org.luanchcode.ExpenseTracker.models.data;

import org.luanchcode.ExpenseTracker.models.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ExpenseRepository extends CrudRepository<Expense, Integer> {
}
