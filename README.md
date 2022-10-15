# MATSim - Multi-Agent Transport Simulation 
#### Personal notes from the e-book MATSim
https://www.ubiquitypress.com/site/books/10.5334/baw/read/?loc=Chapter_01.xhtml

## Introduction
At this time, MATSim is designed to model a single day, the common unit of analysis for activity-based models (see, for example, the review by Bowman, 2009a). Nevertheless, in principle, a multi-day model could be implemented (Horni and Axhausen, 2012b).

As shown in Section 1.4, MATSim is based on the co-evolutionary principle. Every agent repeatedly optimizes its daily activity schedule while in competition for space-time slots with all other agents on the transportation infrastructure. This is somewhat similar to the route assignment iterative cycle, but goes beyond route assignment by incorporating other choice dimensions like time choice (Balmer et al., 2005b), mode choice (Grether et al., 2009), or destination choice (Horni et al., 2012b) into the iterative loop.

Uma execução do MATSim contém um número configurável de iterações, representado pelo loop da Figura 1.1 e detalhado abaixo. Parte-se de uma demanda inicial decorrente das cadeias de atividades diárias da população da área de estudo. As pessoas modeladas são chamadas de agentes no MATSim. As cadeias de atividades geralmente são derivadas de dados empíricos por meio de amostragem ou modelagem de escolha discreta. Uma variedade de abordagens é adequada, conforme evidenciado nos capítulos dos cenários (cf. Capítulo 52 ). Durante as iterações, essa demanda inicial é otimizada individualmente por cada agente. Cada agente possui uma memória contendo um número fixo de planos diários, onde cada plano é composto por uma cadeia de atividades diárias e uma pontuação associada. A pontuação pode ser interpretada como uma utilidade econométrica (cf. Capítulo 51 ).


