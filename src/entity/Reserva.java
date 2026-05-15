package entity;

public class Reserva {

    private int id;
    private String usuario;
    private String sala;
    private String data;
    private String horario;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Reserva(int id, String usuario, String sala, String data, String horario, String status) {
        this.id = id;
        this.usuario = usuario;
        this.sala = sala;
        this.data = data;
        this.horario = horario;
        this.status = status;
    }

    public void exibirDados() {

        System.out.println("Id: " + id);
        System.out.println("Usuário: " + usuario);
        System.out.println("Sala: " + sala);
        System.out.println("Data: " + data);
        System.out.println("Horário: " + horario);
        System.out.println("Status: " + status);
    }
}