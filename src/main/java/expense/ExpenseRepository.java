package expense;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource( collectionResourceRel = "expenses", path="expenses")
public interface ExpenseRepository extends PagingAndSortingRepository<Expense, Long> {

    List<Expense> findByReason(@Param("reason") String reason);

}


