package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions

	private final Map<String, Student> universityDatabase;
	
	
	
	public UniversityDatabase() {
		super();
		this.universityDatabase = new HashMap<String, Student>();
	}

	public void addStudent(String accountName, Student student) {
		// TODO
		universityDatabase.put(accountName, student);
	}

	public int getStudentCount() {
		// TODO
		return universityDatabase.size();
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		if(universityDatabase.get(accountName) != null) {
			Student name = universityDatabase.get(accountName);
		return name.getFullName();
		}
		else {
			return null;
		}
	}

	public double getTotalBearBucks() {
		// TODO
		double total = 0;
		for(String name : universityDatabase.keySet()) {
			total += universityDatabase.get(name).getBearBucksBalance();
		}
		return total;
	}
}
