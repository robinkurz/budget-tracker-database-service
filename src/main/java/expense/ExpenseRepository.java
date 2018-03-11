package expense;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource( collectionResourceRel = "expenses", path="expenses")
public interface ExpenseRepository extends PagingAndSortingRepository<Expense, Long>{

    //https://www.reddit.com/r/javahelp/comments/2khy41/help_spring_repositoryrestresource_queries_with/
    List<Expense> findByDateContaining(@Param("monthAndYear") String monthAndYear);

}


