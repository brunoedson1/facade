# 🏛️ Padrão Estrutural **Facade** – Relatório Financeiro

O padrão **Facade** fornece uma **interface simples** para um **subsistema complexo**.  
Em vez de o cliente conversar com várias classes diferentes, ele usa apenas **uma fachada**, que coordena todas as ações internas.

No projeto do **Relatório Financeiro**, a Facade centraliza as verificações de **pendências** em vários setores antes de permitir o **fechamento** do relatório.

---

# 🎯 Objetivo no projeto

Ao tentar fechar um relatório financeiro, é necessário garantir que **nenhum setor pendente** exista:

- **Setor Fiscal**  
- **Setor Contábil**  
- **Controladoria**

Sem a Facade, o cliente teria de verificar cada setor manualmente.  
Com a Facade, o cliente simplesmente chama:

---

## Classe base: SetorRelatorio

Classe abstrata comum aos setores:
- Mantém uma lista de relatórios com pendência.
- Métodos principais:

```
addRelatorioPendente(Relatorio relatorio)
verificarRelatorioComPendencia(Relatorio relatorio)
```
Todos os setores concretos herdam essa lógica.


## Setores concretos

- SetorFiscal
- SetorContabil
- SetorControladoria

Características:

✔ São singletons

✔ Herdam de SetorRelatorio

✔ Podem registrar pendências usando addRelatorioPendente

---

## 🧪 Testes Criados

Os testes garantem:

✔ Quando algum setor tem pendência

relatorio.fechar() deve retornar false.

✔ Quando nenhum setor registra pendência

relatorio.fechar() deve retornar true.

---

## 🚀 Benefícios da Facade no Relatório Financeiro

| Benefício | Descrição |
|----------|-----------|
| 🧩 **Simplicidade para o cliente** | O cliente chama apenas `relatorio.fechar()`. |
| 🔌 **Baixo acoplamento** | O cliente não precisa conhecer nenhum setor interno. |
| 📍 **Centralização de regras** | Toda a lógica de verificação fica dentro da `RelatorioFacade`. |
| 🔧 **Fácil manutenção** | Para adicionar novos setores ou regras, basta alterar a fachada. |

---

## 💡 Possíveis evoluções

- Registrar logs automáticos das verificações.
- Retornar mensagens indicando qual setor está pendente.
- Implementar uma Facade mais robusta com tratamento de exceções e auditoria.

O padrão Facade deu ao projeto uma interface clara e limpo para operações críticas, escondendo toda a complexidade dos setores internos e tornando o sistema mais sustentável e fácil de evoluir.
