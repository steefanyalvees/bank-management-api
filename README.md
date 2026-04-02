<h1 align="center">💳 Bank API</h1>

<p align="center">
  API REST para gerenciamento de contas bancárias (criação, depósito e saque)
</p>

---

<h2>🚀 Tecnologias</h2>

<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>Spring MVC</li>
  <li>Spring Data JPA</li>
  <li>PostgreSQL</li>
</ul>

---

<h2>📌 Funcionalidades</h2>

<ul>
  <li>Criar conta bancária</li>
  <li>Buscar conta por ID</li>
  <li>Depositar dinheiro</li>
  <li>Sacar dinheiro</li>
</ul>

---

<h2>⚙️ Como Executar</h2>

<p>Clonar o repositório:</p>

<pre>
git clone https://github.com/seu-usuario/bank-api.git
</pre>

<p>Construir o projeto:</p>

<pre>
./mvnw clean package
</pre>

<p>Executar:</p>

<pre>
java -jar target/bank-api-0.0.1-SNAPSHOT.jar
</pre>

<p>
A aplicação estará disponível em:
<a href="http://localhost:8080">http://localhost:8080</a>
</p>

---

<h2>📡 Endpoints</h2>

<h3>➕ Criar Conta</h3>

<pre>
POST /api/accounts
</pre>

<pre>
{
  "accountHolderName": "John Doe",
  "balance": 1000
}
</pre>

---

<h3>🔍 Buscar Conta</h3>

<pre>
GET /api/accounts/{id}
</pre>

---

<h3>💰 Depositar</h3>

<pre>
PUT /api/accounts/{id}/deposit
</pre>

<pre>
{
  "amount": 500
}
</pre>

---

<h3>💸 Sacar</h3>

<pre>
PUT /api/accounts/{id}/withdraw
</pre>

<pre>
{
  "amount": 200
}
</pre>

---

<h2>🧠 Regras de Negócio</h2>

<ul>
  <li>Não é permitido sacar mais do que o saldo disponível</li>
  <li>A conta deve existir para qualquer operação</li>
</ul>

---

<h2>🏗️ Arquitetura</h2>

<ul>
  <li><b>Controller</b> → Requisições HTTP</li>
  <li><b>Service</b> → Regras de negócio</li>
  <li><b>Repository</b> → Acesso ao banco</li>
  <li><b>DTO</b> → Transferência de dados</li>
  <li><b>Mapper</b> → Conversão de dados</li>
</ul>

---

<h2>👩‍💻 Autora</h2>

<p>Desenvolvido por <b>Stefany</b> 🚀</p>
