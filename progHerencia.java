class Persona{
    String nombre;
    String correo;
    String telefono;

    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }

    public void setCorreo(String corr){
        correo = corr;
    }
    public String getCorreo(){
        return correo;
    }

    public void setTelefono(String tel){
        telefono = tel;
    }
    public String getTelefono(){
        return telefono;
    }
}

class Alumno extends Persona{
    String matricula;
    int promedio;

    public void setMatricula(String mat){
        matricula = mat;
    }
    public String getMatricula(){
        return matricula;
    }

    public void setPromedio(int prom){
        promedio = prom;
    }
    public int getPromedio(){
        return promedio;
    }
}

class Profesor extends Persona{
    int numempleado;
    int sueldo;

    public void setNumempleado(int num){
        numempleado = num;
    }
    public int getNumempleado(){
        return numempleado;
    }

    public void setSueldo(int suel){
        sueldo = suel;
    }
    public int getSueldo(){
        return sueldo;
    }
}

public class progHerencia {
    public static void main(String[] args) {
        Alumno al1 = new Alumno();
        Profesor prof1 = new Profesor();
        al1.setNombre("Alexis");
        al1.setCorreo("alexis.seaman@uabc.edu.mx");
        al1.setTelefono("6651441144");
        al1.setMatricula("1267145");
        al1.setPromedio(70);

        prof1.setNombre("Reyes");
        prof1.setCorreo("jreyes@uabc.edu.mx");
        prof1.setTelefono("6643248967");
        prof1.setNumempleado(345632);
        prof1.setSueldo(5000);

        System.out.println("Nombre alumno: "+al1.getNombre());
        System.out.println("Correo alumno: "+al1.getCorreo());
        System.out.println("Telefono alumno: "+al1.getTelefono());
        System.out.println("Matricula: "+al1.getMatricula());
        System.out.println("Promedio: "+al1.getPromedio());

        System.out.println("Nombre Profesor: "+prof1.getNombre());
        System.out.println("Correo Profesor: "+prof1.getCorreo());
        System.out.println("Telefono Profesor: "+prof1.getTelefono());
        System.out.println("Numero de Empleado: "+prof1.getNumempleado());
        System.out.println("Sueldo: "+prof1.getSueldo());
    }
    
}
