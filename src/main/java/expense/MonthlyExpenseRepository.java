package expense;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource( collectionResourceRel = "monthlyExpenses", path="monthlyExpenses")
public interface MonthlyExpenseRepository extends PagingAndSortingRepository<MonthlyExpense, Long> {

    List<Expense> findByReason(@Param("reason") String reason);

}


