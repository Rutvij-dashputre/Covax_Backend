package in.edac;


import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

	Patient findByUsernameAndPassword(String username, String password);
	/*
	 * List<User> findByUsername(String username);
	 * 
	 * User findByUsernameAndPassword(String username, String password);
	 * 
	 * List<User> findByUsernameOrEmail(String username, String email);
	 */
}
