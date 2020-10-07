package Prototype;

import java.io.*;

public class DeepPrototype implements Serializable, Cloneable {

    public String name;
    public DeepCloneableTarget deepCloneableTarget;  // reference
    public DeepPrototype() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        DeepPrototype deepPrototype = (DeepPrototype)super.clone();
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();
        return deepPrototype;
    }

    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // inverse serializing
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (DeepPrototype)ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
