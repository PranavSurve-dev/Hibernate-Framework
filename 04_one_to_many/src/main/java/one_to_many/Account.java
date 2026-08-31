package one_to_many;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private long ac_no;
	private String accountholdername;
	
	public Account() {
		
	}
	
	public Account(long ac_no, String accountholdername) {
		
		this.ac_no = ac_no;
		this.accountholdername = accountholdername;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAc_no() {
		return ac_no;
	}

	public void setAc_no(long ac_no) {
		this.ac_no = ac_no;
	}

	public String getAccountholdername() {
		return accountholdername;
	}

	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", ac_no=" + ac_no + ", accountholdername=" + accountholdername + "]";
	}
		
}
