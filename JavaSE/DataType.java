package JavaSE;

public class DataType {
    public static void main(String[] args) {
        int n= 1234567890; //el max. de 10 digitos
        long nL=12345678901L;//se coloca una "L" al final para diferenciarlo del "int"

        double nD=123.45678912;//para mayor precision
        float nF=124.532164F; //se coloca una "F" para diferenciarlo de "double"

        var salary=1000;//int
        //pension 3%
        var pension= salary*0.03; //double
        var totalSalary = salary - pension;//dar como resultado un double
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName="Anahi Salgado";
        System.out.println("Employee: " + employeeName + ", Salary: "+ totalSalary);
    }
}
