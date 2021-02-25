package in.edac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/patient-register")
public class PatientRegisterAction {
	
	@Autowired
	PatientRepository patientRepository;
	
	@PostMapping("/")
	public void createPatient(Patient patient) {
		patientRepository.save(patient);
	}
	
	
	@GetMapping("/")
	public List<Patient> getPatient() {
		return patientRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Patient getPatient(@PathVariable int id) {
		return patientRepository.findById(id).get();
	}
	
	
	@PutMapping("/{id}")
	public void updatePatient(@PathVariable int id, Patient user) {
		patientRepository.save(user);
	}
	
	
	@DeleteMapping("/{id}")
	public void deletePatient(@PathVariable int id) {
		patientRepository.deleteById(id);
	}


	
	
	
}
	
	

