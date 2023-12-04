# 𝐃𝐈𝐀𝐆𝐑𝐀𝐌𝐀 𝐃𝐄 𝐂𝐋𝐀𝐒𝐒𝐄𝐒 𝐃𝐎 𝐒𝐈𝐒𝐓𝐄𝐌𝐀 𝐃𝐄 𝐆𝐄𝐒𝐓𝐀̃𝐎 𝐃𝐄 𝐇𝐎𝐒𝐓𝐄𝐋𝐒
![Diagrama de Classes - Hostelaria](https://github.com/alansssilva/Sistema-de-Hostelaria/assets/129136467/4923787e-b6cb-477b-b99c-16a1fddc8192)

<div align="center">
<img src="https://github.com/alansssilva/Sistema-de-Hostelaria/assets/129136467/4923787e-b6cb-477b-b99c-16a1fddc8192" width="0px" />
</div>

## 𝐌𝐈𝐍𝐈-𝐌𝐔𝐍𝐃𝐎

No sistema de gestão de hostels, temos uma classe central chamada EmpresaHostel. Essa classe desempenha o papel de cadastrar e gerenciar os hostels relacionados à empresa. Os gerentes são responsáveis por cadastrar as empresas dentro do sistema, estabelecendo uma conexão vital entre a EmpresaHostel e os diferentes hostels.

Cada Hostel contém informações essenciais sobre suas instalações, representadas pelo preço e pela classe Endereco, que armazena detalhes como rua, número, bairro, cidade, estado e CEP. Isso proporciona uma visão completa e estruturada dos locais disponíveis, no sistema os Hostels também é disponibilizada a função de descrição e avaliação.

A classe Pessoa é uma entidade abstrata, sendo a base para dois papéis fundamentais no sistema: Cliente e Funcionario. Os clientes são aqueles que desfrutam dos serviços dos hostels, enquanto os funcionários desempenham funções cruciais na operação do sistema.

Para gerenciar as diferentes responsabilidades dos funcionários, introduzimos a classe Cargo, que determina se um funcionário é um gerente ou um colaborador regular. Além disso, o cargo especifica o salário e os acessos associados.

A segurança do sistema é garantida pela classe Usuario, responsável pelo controle de acesso. Cada pessoa tem um nome de usuário e uma senha exclusivos para garantir a autenticação adequada.

Por fim, o processo de pagamento é tratado pela classe Pagamento. Os clientes realizam pagamentos no sistema, e essas transações são vinculadas aos respectivos hostels, garantindo uma integração eficiente entre as operações financeiras e a gestão de acomodações.

