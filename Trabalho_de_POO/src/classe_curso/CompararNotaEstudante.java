package classe_curso;


import java.util.Comparator;
import classe_estudante.*;

class CompararNotaEstudante implements Comparator<Estudante> {
    //@Override caso Java na versão mais recente
    public int compare(Estudante est1, Estudante est2) {

        if (est1.getNota() < est2.getNota()) {
            return 1;
        } else if (est1.getNota() > est2.getNota()) {
            return -1;
        } else {
            return 0;
        }
    }
}