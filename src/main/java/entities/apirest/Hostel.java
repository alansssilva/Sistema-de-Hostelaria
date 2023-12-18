package entities.apirest;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "hostels")
public class Hostel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hostel")
    private Long idHostel;

    @Column(name = "nome", nullable = false)
    private String nome;

    @OneToOne
    @JoinColumn(name = "id_endereco", nullable = false)
    private Endereco endereco;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "avaliacao")
    private String avaliacao;

    @Column(name = "preco")
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "id_empresa_hostel", nullable = false)
    private EmpresaHostel empresaHostel;

    @OneToMany(mappedBy = "hostel")
    private List<Pagamento> pagamentos;

    public Hostel() {
    }

    public Hostel(String nome, Endereco endereco, String descricao, String avaliacao, Double preco, EmpresaHostel empresaHostel) {
        this.nome = nome;
        this.endereco = endereco;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
        this.preco = preco;
        this.empresaHostel = empresaHostel;
    }

    public Long getIdHostel() {
        return idHostel;
    }

    public void setIdHostel(Long idHostel) {
        this.idHostel = idHostel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public EmpresaHostel getEmpresaHostel() {
        return empresaHostel;
    }

    public void setEmpresaHostel(EmpresaHostel empresaHostel) {
        this.empresaHostel = empresaHostel;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
}
