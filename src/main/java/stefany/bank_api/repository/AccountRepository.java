package stefany.bank_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stefany.bank_api.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
