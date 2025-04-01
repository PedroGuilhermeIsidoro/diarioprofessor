
package diarioprofessor.model;
import java.util.Scanner;

public class Diario {
    public String[] nomesAlunos = new String[5];
    public int[] faltasAlunos = new int[5];
    public double[] notasAlunos = new double[5];
    public int i=0;
    public Scanner scan = new Scanner(System.in);
    
    public void apresentarAlunos(){
        for(i=0;i<=4;i++){
        System.out.println("Nome: "+this.nomesAlunos[i]+"\n"+"Faltas: "+this.faltasAlunos[i]+"\n"+"Notas: "+this.notasAlunos[i]);
        }
    }
    public void criarAlunos(){
        for(i=0;i<=4;i++){
        System.out.println("Nome do aluno: ");
        this.nomesAlunos[i]=scan.next();        
        System.out.println("Numero de faltas do aluno: ");
        this.faltasAlunos[i]=scan.nextInt();
        System.out.println("Nota do aluno: ");
        this.notasAlunos[i]=scan.nextDouble();
        }
    }
}
