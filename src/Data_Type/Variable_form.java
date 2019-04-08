package Data_Type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Variable_form implements Serializable {
    /**
     * this is thr form of the Scope or the DataType by general
     * the attributes meaning the variables in the table we have
     */

    List<Attribute_form> attributes = new ArrayList<>();
    private boolean isImperative;
    private String HDFSPath = null;
    private String Delimiter = null;

    public Variable_form() {

    }

    /**
     * @param attribute_form, jsut one attribute, so
     *                        it is an imperative variable
     */
    public Variable_form(Attribute_form attribute_form) {
        this.attributes.add(attribute_form);
        this.isImperative = true;
    }

    public void setImperative(boolean imperative) {
        isImperative = imperative;
    }

    public void setHDFSPath(String HDFSPath) {
        this.HDFSPath = HDFSPath;
    }

    public void setDelimiter(String delimiter) {
        Delimiter = delimiter;
    }

    public String getHDFSPath() {
        return HDFSPath;
    }

    public String getDelimiter() {
        return Delimiter;
    }

    public Variable_form(Attribute_form attribute_form, boolean isImperative) {
        this.attributes.add(attribute_form);
        this.isImperative = isImperative;
    }

    public Variable_form(List<Attribute_form> attributes , boolean isImperative, String delimiter, String HDFSPath) {
        this.attributes=attributes;
        this.isImperative = isImperative;
        if (!isImperative) {
            this.HDFSPath = HDFSPath;
            this.Delimiter = delimiter;
        }
    }


    public Variable_form(Attribute_form... variables) {
        Collections.addAll(this.attributes, variables);
    }

    public List<Attribute_form> getAttributes() {
        return attributes;
    }

    public void addAttribute(Attribute_form... attribute) {
        Collections.addAll(attributes, attribute);
    }

    public boolean isImperative() {
        return isImperative;
    }

//    public void printAttriputes() {
//        for (Attribute_form attribute_form : attributes) {
//            System.out.println("attripute name: " +
//                    attribute_form.getName() + "\n attripute type: " + attribute_form.getType());
//        }
//    }


    @Override
    public String toString() {
        return "Variable_form{" +
                "attributes=" + attributes +
                ", isImperative=" + isImperative +
                '}';
    }

}
