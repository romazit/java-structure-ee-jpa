package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author romanm
 */
@Entity
public class Stk implements Serializable{

    @Id
    private String C0;

    public String getC0() {
        return C0;
    }

    public void setC0(String C0) {
        this.C0 = C0;
    }



}
