package padroescriacao.builder;

import java.util.Date;

public class HospitalBuilder {

        private Hospital hospital;
    private int cnpj;

    public HospitalBuilder() {
            hospital = new Hospital();
        }

        public Hospital build() {
            if (hospital.getCnpj() == 0) {
                throw new IllegalArgumentException("CNPJ Inesistente");
            }
            if (hospital.getNome().equals("")) {
                throw new IllegalArgumentException("Nome Inesistente");
            }
            return hospital;
        }

    public int getCnpj() {
        int cnpj = 0;
        return cnpj;
    }
    public String getNome() {
        String nome = null;
        return nome;
    }

    public HospitalBuilder setCnpj(int cnpj) {
        hospital.setCnpj(cnpj);
        return this;
    }
    public HospitalBuilder setNome(String nome) {
        hospital.setNome(nome);
        return this;
    }

    public HospitalBuilder setCnpj(String cnpj) {
        hospital.setCnpj(Integer.parseInt(cnpj));
        return this;
    }

    public HospitalBuilder setEnderecoNumero(int enderecoNumero) {
        hospital.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public HospitalBuilder setEnderecoBairro(String enderecoBairro) {
        hospital.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public HospitalBuilder setEnderecoCidade(String enderecoCidade) {
        hospital.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public HospitalBuilder setEnderecoUF(String enderecoUF) {
        hospital.setEnderecoUF(enderecoUF);
        return this;
    }

    public HospitalBuilder setCep(String cep) {
        hospital.setCep(cep);
        return this;
    }

    public HospitalBuilder setEmail(String email) {
        hospital.setEmail(email);
        return this;
    }




}
