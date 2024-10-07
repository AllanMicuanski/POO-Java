public class Ponto3D extends Ponto2D {
    private float z = 0.0f;

    public Ponto3D() {
        super();
    }

    public Ponto3D(float x, float y, float z) {
        super(x, y);  // Chama o construtor da superclasse Ponto2D
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);  // Usa o método herdado de Ponto2D para configurar x e y
        this.z = z;
    }
}
