package ass1;
import java.util.ArrayList;
import java.util.*;

//////////////////////////////////////////////////////////////////////////
class student{
	//LinkedList list1=new LinkedList();
	private float cgpa_of_student;
	private String branch_name;
	private int rollno;
	private Boolean placement_status;
	private String statement;
	
	student(float cgpa_of_student,String branch_name,int rollno,Boolean placement_status){
		this.cgpa_of_student=cgpa_of_student;
		this.branch_name=branch_name;
		this.rollno=rollno;
		this.placement_status=placement_status;
	}
	public void setcgpa(float cgpa_of_student) {
		this.cgpa_of_student=cgpa_of_student;
	}
	public void setbranch(String branch_name) {
		this.branch_name=branch_name;
	}
	public void setrollno(int rollno) {
		this.rollno=rollno;
	}
	public void setplacementstatus(Boolean placement_status) {
		this.placement_status=placement_status;
	}
	public float getcgpa() {
		//System.out.println(this.cgpa_of_student);
		return this.cgpa_of_student;
	}
	public String getbranch() {
		//System.out.println(this.branch_name);
		return this.branch_name;
	}
	public int getrollno() {
		//System.out.println(this.rollno);
		return this.rollno;
	}
	public String getplacementstatus() {
		if(this.placement_status!=false)
			this.statement="placed";
		else
			this.statement="not placed";
		//System.out.println(this.statement);
		return this.statement;
	}
	
	
}

/////////////////////////////////////////////////////
class addcompany{
	static Scanner s;
	public ArrayList<Integer> a;
	public ArrayList<Integer> b;
	private String company_name;
	private int course_criteria;
	private int no_of_student_required;
	private Boolean cmp_status;
	private String add_branches;
	private String application_status;
	addcompany(String company_name,int course_criteria,int no_of_student_required,Boolean cmp_status){
		this.company_name=company_name;
		this.course_criteria=course_criteria;
		this.no_of_student_required=no_of_student_required;
		this.cmp_status=cmp_status;	
	}
	public void setcompanyname(String company_name) {
		this.company_name=company_name;
	}
	public void setcurseinfo(int course_criteria) {
		this.course_criteria=course_criteria;
	}
	public void setstudentrequired(int no_of_student_required) {
		this.no_of_student_required=no_of_student_required;
	}
	public void setcompanystatus(Boolean cmp_status) {
		this.cmp_status=cmp_status;
	}
	public String getcompanyname() {
		//System.out.println("company name is: "+ this.company_name);
		return this.company_name;
	}
	public int getcourseinfo() {
		//System.out.println("course criteria"+this.course_criteria);
		return this.course_criteria;
	}
	public int getstudentrequired() {
		//System.out.println("Number Of Required Students ="+this.no_of_student_required);
		return this.no_of_student_required;
	}
	public String getcompanystatus() {
		if(this.cmp_status!=false)
			this.application_status="application status: OPEN";
		else
			this.application_status="application status: CLOSE";
		//System.out.println(this.application_status);
		return application_status;
	}	
	
}

public class first {
	
	
	static Scanner s=new Scanner(System.in);
	static addcompany cmp;
	static student st;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<student> st1 = new ArrayList<student>();
		ArrayList<addcompany> cmp1 = new ArrayList<addcompany>();
		int n=s.nextInt();
		
		int mark;
		int r=1;
		for(int i=0;i<n;i++) {
			float cg=s.nextFloat();
			String branch=s.next();
			//list1.insert(list1,branch,i+1,cg,"NOT PLACED");
			st=new student(cg,branch,i+1,false);
			st1.add(st);
			//System.out.println(st1.get(0).getcgpa());
			
			//st1.add(stud);
			//st1.getbranch();
		}
		Boolean t=true;
	while(t) {
		int q=s.nextInt();
		String c_name,add_br;
		int criteria;
		int m=100;
		String[] arr=new String[m];
		int no_student;
		if(q==8) {
			int roll=s.nextInt();
			System.out.println(st1.get(roll-1).getrollno());
			System.out.println(st1.get(roll-1).getcgpa());
			System.out.println(st1.get(roll-1).getbranch());
			System.out.println(st1.get(roll-1).getplacementstatus());
			
				}
		
		if(q==1) {
			System.out.println("company name:");
			c_name=s.next();
			System.out.println("Number Of Eligible Courses =");
			criteria=s.nextInt();
			m=criteria;
			for(int j=0;j<=criteria;j++) {
				add_br=s.nextLine();
				arr[j]=add_br;
			}
			System.out.println("Number Of Required Students =");
			no_student=s.nextInt();
			cmp=new addcompany(c_name,criteria,no_student,true);
			cmp1.add(cmp);
			System.out.println(cmp.getcompanyname());
			System.out.println(cmp.getcourseinfo());
			for(int i=0;i<criteria;i++) {
				System.out.println(arr[i]);
			}
			//
			//list2.printList(list2);
			System.out.println(cmp.getstudentrequired());
			System.out.println(cmp.getcompanystatus());
			for(int i=0;i<n;i++) {
				
				for(int j=0;j<n;j++) {
					
					String a=st1.get(i).getbranch();
					String b=arr[j];
					if(a.equals(b)) {
						int newr=st1.get(i).getrollno();
						cmp.a.add(newr);
						System.out.println("Enter scores for the technical round.");
						System.out.println("enter the score for roll_no"+newr+":");
						mark=s.nextInt();
						cmp.b.add(mark);
							//list3.insert(list3,last1.ro,mark,last2.data);
					}
					
					
				}
			}
				
		}
		if(q==5) {
			if(cmp.getcompanystatus()=="true")
				System.out.println(cmp.getcompanystatus());
		}
		if(q==4) {
			if(st.getplacementstatus()=="false")
				System.out.println(st.getplacementstatus());
		}
		if(q==7) {
			String cp_name=s.nextLine();
			for(int i=0;i<cmp1.size();i++) {
				if(cmp1.get(i).getcompanyname()==cp_name) {
					System.out.println(cmp1.get(i).getcompanyname());
					System.out.println(cmp1.get(i).getcourseinfo());
					System.out.println(cmp1.get(i).getstudentrequired());
					System.out.println(cmp1.get(i).getcompanystatus());
				}
				
		}}
		if(q==9) {
				int roll=s.nextInt();
				if(cmp.a.get(roll)==roll)
					System.out.println(cmp1.get(roll).getcompanyname());
		}
		if(q==6) {
			String cmp_nm=s.nextLine();
			if(cmp.getcompanyname().contentEquals(cmp_nm)) {
				Collections.sort(cmp.a);
				int len1= cmp.a.size();
				int len2=cmp.b.size(); 
		        
		        for (int i = 0; i <len1-1; i++)
		        {
		            int min_idx = i;
		            for (int j = i+1; j < len1; j++)
		                if (cmp.a.get(i) < cmp.a.get(min_idx))
		                    min_idx = j;
		 
		            int temp1 = cmp.a.get(min_idx);
		            int temp2 = cmp.b.get(min_idx);
		            int var1=cmp.a.get(min_idx);
		            var1= cmp.a.get(i);
		            int var2=cmp.a.get(i);
		            int vr1=cmp.b.get(min_idx);
		            vr1=cmp.b.get(i);
		            int vr2=cmp.b.get(i);
		            var2 = temp1;
		            vr2=temp2;
		        }
		        System.out.println("rollno of selected student:"+cmp.a.get(cmp.a.size()-1));
		        
			}
		//	if()
			
			}
		
	
		
		
		if(q==3) {
			if(cmp.getcompanystatus()=="false")
				System.out.println(cmp.getcompanyname());
				
		}
		for(int i=0;i<cmp1.size();i++) {
			if(cmp1.get(i).getcompanystatus()=="close")
				t=false;}
		}
		//while terminate
		}

}