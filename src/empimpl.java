import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
//comprator sort by id(by default ascending)
//sort by name
public class empimpl {
public static void main(String[] args) {
	ArrayList<Emp> emp = new ArrayList<>();
	emp.add(new Emp("Apurva",3245,12));
	emp.add(new Emp("Nisha",39858,15));
	emp.add(new Emp("Kabeer",15258,13));
	emp.add(new Emp("Nishant",324528,19));
	System.out.println(emp);
	Collections.sort(emp,new Idcomparator());
	System.out.println(emp);
	ArrayList<Emp> emp1 = new ArrayList<>(emp);
	Collections.sort(emp1,new Namecomparator());
}
}
