## Experimental 1 
2.1 No, a class doesn't always have to have both attributes and methods. A class can have:  
- Only attributes (like a simple data holder/PODO - Plain Old Java Object)  
- Only methods (utility classes)  
- Both attributes and methods  
- Neither (empty class, though rarely useful)  
For an array of objects, the class primarily needs attributes to store data. Methods are optional but recommended for better encapsulation and code organization.  
2.2 This code declares and creates an array named arrayOfMahasiswa that can hold 3 references to Mahasiswa objects. It:  
- Creates an array object with size 3 in memory  
- Each array element is initialized to null (default value for object references)  
- Does NOT create any Mahasiswa objects yet  
2.3 If the Student class doesn't explicitly define any constructor, Java automatically provides a default constructor (no-argument constructor). The line:  
*arrayOfMahasiswa[0] = new Mahasiswa();*  
calls this default constructor to create a new Mahasiswa object.  
2.4 This code assigns values to the attributes of the first Mahasiswa object in the array:  
- Sets nim (student ID) to "244107060033"  
- Sets nama (name) to "MUBASSYIR SYAKIB ALFATIH"  
- Sets kelas (class) to "TI-1B"  
- Sets ipk (GPA) to 3.75 (cast to float)  
2.5 They are separated for:  
- Separation of concerns: Mahasiswa class defines the data structure (attributes) and behavior,while    
- MahasiswaDemo handles the program flow and user interaction  
- Reusability: Student class can be reused in other programs  
- Maintainability: Changes to Student structure don't affect the demo class logic  
- Modularity: Each class has a single, well-defined responsibility  
## Experimental 2
3.1 done  
3.2 This code causes a NullPointerException because:  
- Mahasiswa[] myArrayOfMahasiswa; only declares a reference variable  
- The array object itself hasn't been created (no new Mahasiswa[size])  
- Trying to access myArrayOfMahasiswa[0] when the array reference is null throws an error  
## Experimental 3
4.1 Yes, a class can have multiple constructors (constructor overloading).  
4.2 done  
4.3 done   
4.4 done  