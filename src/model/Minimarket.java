package model;
import exceptions.IDNoMatchException;
import java.util.*;
import java.time.LocalDate;

public class Minimarket {

	private Person income;
	private ArrayList<Person> people;
	
	public Minimarket() {
		 people = new ArrayList<>();
	}
	
	public ArrayList<Person> getPeople(){
		return people;
	}
	
	public void addPerson(String t, int i) throws IDNoMatchException{
		if(t.equals("TI")){
			System.out.println("Childrens are not allowed");
		}else{
			int date = LocalDate.now().getDayOfMonth();
			String n1 = Integer.toString(i);
			int cc = n1.charAt(n1.length()-1);
			if(date%2==0&&cc%2!=0) {
				Person p = new Person(t,i);
				 people.add(p);
			}else if(date%2!=0&&cc%2==0) {
				Person p = new Person(t,i);
				 people.add(p);
			}else {
				throw new IDNoMatchException(date,cc);
			}
			 
		}
	}
}
