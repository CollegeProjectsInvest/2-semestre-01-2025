public abstract class Entity {
    private float life;

    // method abstrato, não implementa nada
    public abstract void mover();
    public abstract void atacar();

    // method concreto
    public void renderizar() {
        System.out.println("Renderizar");
    }
}
