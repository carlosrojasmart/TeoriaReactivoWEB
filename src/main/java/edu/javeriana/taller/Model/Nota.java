package edu.javeriana.taller.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("nota")
public class Nota {

    @Id
    private Integer id;
    private Integer materiaId;      // Llave foránea a MATERIA
    private Integer profesorId;     // Llave foránea a PROFESOR
    private String cursoCodigo;     // Llave foránea a CURSO
    private Integer estudianteId;   // Llave foránea a ESTUDIANTE
    private String observacion;
    private Double valor;           // Valor de la nota
    private Double porcentaje;      // Porcentaje de la nota

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Integer materiaId) {
        this.materiaId = materiaId;
    }

    public Integer getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(Integer profesorId) {
        this.profesorId = profesorId;
    }

    public String getCursoCodigo() {
        return cursoCodigo;
    }

    public void setCursoCodigo(String cursoCodigo) {
        this.cursoCodigo = cursoCodigo;
    }

    public Integer getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Integer estudianteId) {
        this.estudianteId = estudianteId;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }
}

