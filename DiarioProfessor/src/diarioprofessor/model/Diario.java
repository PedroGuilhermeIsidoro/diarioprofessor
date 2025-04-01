
package diarioprofessor.model;
import java.util.Scanner;

public class Diario {
    public String[] nomesAlunos = new String[5];
    public int[] faltasAlunos = new int[5];
    public double[][] notasAlunos = new double[3][5];
    public int i=0;
    public int a=0;
    public int hero=0;
    public Scanner scan = new Scanner(System.in);
   
    public void apresentarAlunos(){
        for(i=0;i<=4;i++){
            hero=0;
        System.out.println("Nome: "+this.nomesAlunos[i]+"\n"+"Faltas: "+this.faltasAlunos[i]);
        a=0;
        System.out.println("Nota de S.E: "+this.notasAlunos[a][i]);
        a++;
        System.out.println("Nota de D.M: "+this.notasAlunos[a][i]);
        a++;
        System.out.println("Nota de D.S: "+this.notasAlunos[a][i]);
        System.out.println("Média do aluno: ");
                for(a=0;a<=2;a++){
        hero+=this.notasAlunos[a][i];
        }
                hero=hero/3;
          System.out.println(hero);
    }
        hero=0;
        System.out.println("Média de S.E da turma: ");
        for(i=0;i<=4;i++){
        hero+=this.notasAlunos[0][i];
        }
        hero=hero/3;
          System.out.println(hero);
          hero=0;
          System.out.println("Média de D.M da turma: ");
        for(i=0;i<=4;i++){
        hero+=this.notasAlunos[1][i];
        }
        hero=hero/3;
          System.out.println(hero);
          hero=0;
          System.out.println("Média de D.S da turma: ");
        for(i=0;i<=4;i++){
        hero+=this.notasAlunos[2][i];
        }
        hero=hero/3;
          System.out.println(hero);
    }
    public void criarAlunos(){
        for(i=0;i<=4;i++){
        System.out.println("Nome do aluno: ");
        this.nomesAlunos[i]=scan.next();        
        System.out.println("Numero de faltas do aluno: ");
        this.faltasAlunos[i]=scan.nextInt();
        a=0;
        System.out.println("Nota do aluno em SE: ");
        this.notasAlunos[a][i]=scan.nextDouble();
        a++;
        System.out.println("Nota do aluno em DM: ");
        this.notasAlunos[a][i]=scan.nextDouble();
        a++;
        System.out.println("Nota do aluno em DS: ");
        this.notasAlunos[a][i]=scan.nextDouble();
        }
    }
}
