$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Saude/CentralDeAtendimento/Atendimento-11004.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#enconding: utf-8"
    },
    {
      "line": 2,
      "value": "#Auto generated Octane revision tag"
    }
  ],
  "line": 4,
  "name": "Apollo - Central de Atendimento",
  "description": "Como um analista ,\nQuero que registre um atendimento na central e efetue a Autorização\nPara que tenhamos os atendimentos devidamente registrados",
  "id": "apollo---central-de-atendimento",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@TID11004REV0.1.0"
    }
  ]
});
formatter.before({
  "duration": 749056532,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "que acesso o sistema Apollo",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "preencho \"p0642971\" e \"AYHQoR6g8Jqi\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "o sistema apresenta a tela inicial com a mensagem \"Seja bem-vindo ao novo Sistema Saúde\"",
  "keyword": "And "
});
formatter.match({
  "location": "SistemaApollo.que_acesso_o_sistema_Apollo()"
});
formatter.result({
  "duration": 1022791211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "p0642971",
      "offset": 10
    },
    {
      "val": "AYHQoR6g8Jqi",
      "offset": 23
    }
  ],
  "location": "EfetuarLogin.preencho_e(String,String)"
});
formatter.result({
  "duration": 1352993124,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Seja bem-vindo ao novo Sistema Saúde",
      "offset": 51
    }
  ],
  "location": "SistemaApollo.apresentaMensagemInicial(String)"
});
formatter.result({
  "duration": 2062189609,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Consultar Protocolo",
  "description": "",
  "id": "apollo---central-de-atendimento;consultar-protocolo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Saude"
    },
    {
      "line": 14,
      "name": "@CentralDeAtendimento"
    },
    {
      "line": 14,
      "name": "@ConsultarProtocolo"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "opto por acessar a \"Central de Atendimentos\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "opto por selecionar \"Atendimentos\" -\u003e \"Pesquisar Atendimento\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "opto por preencher um número de protocolo",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "opto por clicar em Pesquisar",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "o sistema retorna as informações referente ao protocolo solicitado",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Central de Atendimentos",
      "offset": 20
    }
  ],
  "location": "MenuInicial.acessaMenuIcone(String)"
});
formatter.result({
  "duration": 9244956840,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Atendimentos",
      "offset": 21
    },
    {
      "val": "Pesquisar Atendimento",
      "offset": 39
    }
  ],
  "location": "MenuLateral.selecionarMenuHover(String,String)"
});
formatter.result({
  "duration": 29125779239,
  "status": "passed"
});
formatter.match({
  "location": "IniciarAtendimento.preencherNumeroProtocolo()"
});
formatter.result({
  "duration": 3039958247,
  "status": "passed"
});
formatter.match({
  "location": "IniciarAtendimento.consultarAtendimento()"
});
formatter.result({
  "duration": 789118685,
  "status": "passed"
});
formatter.match({
  "location": "IniciarAtendimento.valdiarNumeroProtocoloNaGrid()"
});
formatter.result({
  "duration": 1411544005,
  "status": "passed"
});
formatter.after({
  "duration": 2792826528,
  "status": "passed"
});
});