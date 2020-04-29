# SoftwareEngineering
Class work from Software Engineering taught by Dr Mary Ann Cummings at Montana State University


Course Information System – Initial Requirements from Sponsor
 The registrar sets up the curriculum for a semester using a scheduling algorithm.
 One course may have multiple course offerings.
 A course offering may have multiple sections.
 Students may use the system to add/drop courses for a period of time after registration.
 Students may use the system to determine what courses are required for their major or
minor.
 Students may use the system to determine when and where a course is scheduled.
 Students may use the system to determine who is teaching a course offering.
 Professors use the system to receive the number of students in each section and course
offering.

ESOF 322 Group Project
Requirements Definition and Modelling for the Course Information System


Consider me a sponsor and you are competing with all the groups in this class to produce a
Montana State University Course Information System. There are multiple types of users
(registrar, students, and professors). For the students, this would take the place of Myinfo –
Schedule of classes.
There will be 4 assignments total for this group project – Requirements, Design,
Implementation and Testing. This first assignment is for developing/analyzing/modeling the
requirements for this system.
You, as a group, are to write the requirements in natural language. The initial set is on
Brightspace in group projects folder in the file: init reqs.pdf. If you were to only develop a
system with these requirements, your group would receive no more than a C. You want to
write more requirements. You will submit these in brightspace in the assignments-
>requirement modeling folder. Only one of you in the group needs to submit. Put your group
number as the first part of the file: example: Group_1_requirements.pdf.
Also as a group, you will determine what functionality/requirements each group member will
be responsible for. This means that each person will be creating some portion of the system.
That person will then submit me their portion of the system for each assignment. Write this up
in a document called group_<no>_member_responsiblities.<suffix> and submit from the same
person as above.
For this next part, you will use a UML tool of your choice. Each person in the group will submit
the following based on what portion of the system that person is responsible for:
• A set of use cases and use case descriptions that breaks down one or more of these uses
based on what functionality/requirements that person is responsible for. You must
submit these use cases in a pdf file – do not submit in your tool’s native format.
• Conceptual class diagrams of the classes that define the system’s structure.
• The activity diagrams that define the sequential and parallel activities within your
system


ESOF 322 Implementation Assignment
Implementing a portion of the Course Information System
Consider me a sponsor and you are competing with all the groups in this class to produce a
Montana State University Course Information System. There are multiple types of users
(registrar, students, and professors). For the students, this would take the place of Myinfo –
Schedule of classes.
This assignment is for you to take the provided design and implement the 3 requirements. It
must match the design except for:
a) the methods for the strategy pattern will be public (not private)
b) use the class diagram to implement the UI instead of what is shown in the sequence
diagram. (The sequence diagram shows the UI associating with the other classes, but
we want the UI to only interact with main as is shown in the class diagram).
c) do not implement the login/verify credentials.
d) for the requirements for A.11 and A.13, you do not have to show a real form or the
courses that the student has taken or will take. Just put a print statement in the
methods that implement those requirements.
You will use the input file that is in brightspace called 2020-Spring_ScheduleData_20191226.
You must run your program to show that you have implemented all 3 requirements.
You can write the code in either C++ or Java. 
