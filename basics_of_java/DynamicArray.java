class Student{
  int rollno;
  StringDemo name;
  int marks;
}

public class DynamicArray {
  public static void main(StringDemo[] args) {

    //here i am making three object of Student class
     Student s1 = new Student();
     s1.name = "nikhat";
     s1.rollno = 12;
     s1.marks = 78;

     Student s2 = new Student();
     s2.name = "naaz";
     s2.rollno = 21;
     s2.marks = 88;

     Student s3 = new Student();
     s3.name = "naureen";
     s3.rollno = 1;
     s3.marks = 97;

      // Creating an array of Student type to store references of student objects
     Student students[] = new Student[3];

     //assigning the references
     students[0] = s1;   // Assigning the reference of 's1' to the first element in the array
     students[1] = s2;   // Assigning the reference of 's2' to the second element in the array
     students[2] = s3;   // Assigning the reference of 's3' to the third element in the array


      // Looping through each element in the 'students' array and printing details
     for(Student stud : students)// For each student object in the array 'students'
     {
        System.out.println("name :"+ stud.name +" | "+ "marks :"+ stud.marks);
     }
     
  }
}
