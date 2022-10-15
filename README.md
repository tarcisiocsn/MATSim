# MATSim - Multi-Agent Transport Simulation 
#### Personal notes from the e-book MATSim
https://www.ubiquitypress.com/site/books/10.5334/baw/read/?loc=Chapter_01.xhtml

## Introduction
At this time, MATSim is designed to model a single day, the common unit of analysis for activity-based models (see, for example, the review by Bowman, 2009a). Nevertheless, in principle, a multi-day model could be implemented (Horni and Axhausen, 2012b).

As shown in Section 1.4, MATSim is based on the co-evolutionary principle. Every agent repeatedly optimizes its daily activity schedule while in competition for space-time slots with all other agents on the transportation infrastructure. This is somewhat similar to the route assignment iterative cycle, but goes beyond route assignment by incorporating other choice dimensions like time choice (Balmer et al., 2005b), mode choice (Grether et al., 2009), or destination choice (Horni et al., 2012b) into the iterative loop.

Uma execução do MATSim contém um número configurável de iterações, representado pelo loop da Figura 1.1 e detalhado abaixo. Parte-se de uma demanda inicial decorrente das cadeias de atividades diárias da população da área de estudo. As pessoas modeladas são chamadas de agentes no MATSim. As cadeias de atividades geralmente são derivadas de dados empíricos por meio de amostragem ou modelagem de escolha discreta. Uma variedade de abordagens é adequada, conforme evidenciado nos capítulos dos cenários (cf. Capítulo 52 ). Durante as iterações, essa demanda inicial é otimizada individualmente por cada agente. Cada agente possui uma memória contendo um número fixo de planos diários, onde cada plano é composto por uma cadeia de atividades diárias e uma pontuação associada. A pontuação pode ser interpretada como uma utilidade econométrica (cf. Capítulo 51 ).

   <img width="551" alt="image" src="https://user-images.githubusercontent.com/68601128/195968875-99530208-f30b-409a-a389-bcffb7e53915.png">


In every iteration, prior to the simulation of the network loading with the MATSim mobsim (mobility simulation) (e.g., Cetin, 2005), each agent selects a plan from its memory. This selection is dependent on the plan scores, which are computed after each mobsim run, based on the executed plans’ performances. A certain share of the agents (often 10 %) are allowed to clone the selected plan and modify this clone (replanning). For the network loading step, multiple mobsims are available and configurable (see Horni et al., 2011b, and Section 4.3 of this book).

Plan modification is performed by the replanning modules. Four dimensions are usually considered for MATSim at this time: `departure time` (and, implicitly, activity duration) (Balmer et al., 2005b), `route` (Lefebvre and Balmer, 2007), `mode ` (Grether et al., 2009) and `destination` (Horni et al., 2009, 2012b). Further dimensions, such as activity adding or dropping, or parking and group choices are currently under development and only available experimentally. MATSim replanning offers different strategies to adapt plans, ranging from random mutation to approximate suggestions, to best-response answers where, in every iteration, the currently optimal choice is searched. For example, routing often is a best-response modification, while time and mode replanning are random mutations.

If an agent ends up with too many plans (configurable), the plan with the lowestscore (configurable) is removed from the agent’s memory. Agents that have not undergone replanning select between existing plans. The selection model is configurable; in manyMATSim investigations, a model generating a logit distribution for plan selection is used.

An iteration is completed by evaluating the agents’ experiences with the selected day plans (scoring). The applied scoring function is described in detail in Chapter 3.

O processo iterativo é repetido até que a pontuação média da população se estabilize. A curva de desenvolvimento de pontuação típica (Figura 1.2, retirada de Horni et al., 2009) assume a forma de um progresso de otimização evolutiva (Eiben e Smith, 2003, Figura 2.5). Como as simulações são estocásticas, não se pode utilizar critérios de convergência apropriados para algoritmos determinísticos; para uma discussão de possíveis abordagens para a situação do MATSim, veja as Seções 47.3.2.2 e 48.2, bem como Meister (2011).
<img width="526" alt="image" src="https://user-images.githubusercontent.com/68601128/195968996-f9d932f2-120a-47e6-9c61-d59dfc4aa47f.png">

MATSim is strongly based on events stemming from the mobsim. Every action in the simulation generates an event, which is recorded for analysis. These event records can be aggregated to evaluate any measure at the desired resolution. The event architecture is detailed in Section 45.2.5.

## 1.3 MATSim’s Traffic Flow Model
O MATSim fornece dois mobsims internos: QSim e JDEQSim (Java Discrete Event Queue Simulation); além disso, simulações de mobilidade externa podem ser plugadas.
O QSim multi-thread é atualmente o mobsim padrão.
- simulações físicas, apresentando modelos detalhados de acompanhamento de carros,
- autômatos celulares, nos quais estradas são discretizadas em células,
- simulações baseadas em filas (queue-based simulations), onde a dinâmica do tráfego é modelada com filas de espera,
- modelos mesoscópicos, usando agregados para determinar as velocidades de deslocamento, e
- modelos macroscópicos, baseados em fluxos em vez de unidades de viajantes individuais (por exemplo, carros).

Como o MATSim é projetado para cenários de grande escala, ele adota a abordagem baseada em filas computacionalmente eficiente (veja a Figura 1.3). Um carro que entra em um link de rede (ou seja, um segmento de estrada) de uma interseção é adicionado ao final da fila de espera. Permanece lá até que o tempo de deslocamento do link com fluxo livre tenha passado e até que ele esteja à frente da fila de espera e até que o próximo link permita a entrada. A abordagem é muito eficiente, mas claramente tem o preço de uma resolução reduzida, os efeitos de seguimento do carro não são capturados. No JDEQSim, por razões computacionais, a abordagem de fila de espera é combinada com uma etapa de atualização baseada em eventos (Charypar et al., 2009). Em outras palavras, não há processo de atualização baseado em etapas de tempo de nenhum agente no cenário. Em vez disso, os agentes só são tocados se realmente exigirem uma ação. Por exemplo, os links não precisam ser processados ​​enquanto os agentes os percorrem. O acionamento de eventos de atualização é gerenciado por um agendador global. O QSim, no entanto, é baseado em passos de tempo. O modelo de fluxo de tráfego MATSim é fortemente baseado em dois atributos de enlace: capacidade de armazenamento e capacidade de fluxo. A capacidade de armazenamento define o número de carros que cabem em um link de rede.

<img width="552" alt="image" src="https://user-images.githubusercontent.com/68601128/195969322-50c19e97-1f35-4535-9dab-6d5fc3d4795b.png">

A capacidade de fluxo especifica a `capacidade de saída` (outflow capacity) de um link, quantos viajantes podem deixar o respectivo link por etapa de tempo. É um atributo individual do link. A implementação atual do QSim não tem capacidade máxima de entrada especificada. Em contraste, no DEQSim anterior e no JDEQSim atual, uma capacidade de fluxo de entrada também pode ser especificada, o que pode mover congestionamentos nas mesclagens do final do primeiro link comum, onde o QSim os gera, upstream para onde os links se fundem e onde eles plausivelmente deveria ser (Charypar, 2008, p. 99). No entanto, são necessários dados adicionais para isso, que muitas vezes não estão disponíveis.

Este modelo básico de fluxo de tráfego foi estendido com vários módulos: foram adicionados sinais e modelagem de múltiplas faixas (Capítulo 12), lacunas de movimento para trás, conforme investigado por Charypar (2008), estão incluídos no JDEQSim, mas disponíveis apenas em caráter experimental para QSim (Seção 97.5). As interações entre os diferentes modos são descritas na Seção 4.6 e no Capítulo 21.

## MATSim's Co-evolucionary Algorithm
Conforme ilustrado na Figura 1.4, o equilíbrio do MATSim é procurado por um algoritmo coevolutivo (ver, por exemplo, Popovici et al., 2012). Esses algoritmos co-evoluem diferentes espécies sujeitas à interação (por exemplo, competição). No MATSim, os indivíduos são representados por seus planos, onde uma pessoa representa uma espécie. Com o algoritmo coevolutivo, a otimização é realizada em termos de planos dos agentes, ou seja, em todo o plano diário de atividades e viagens. Ele atinge mais do que o equilíbrio de fluxo de tráfego padrão, que ignora as atividades. Eventualmente, um equilíbrio é alcançado, sujeito a restrições, onde os agentes não podem melhorar seus planos unilateralmente.

<img width="535" alt="image" src="https://user-images.githubusercontent.com/68601128/195970113-568e63fc-2b45-4fd9-adaa-a2cc19d95da6.png">

Note that there is a difference between the application of an evolutionary algorithm and a co-evolutionary algorithm. An evolutionary algorithm would lead to a system optimum, as optimization is applied with a global (or population) fitness function. Instead, the co-evolutionary algorithm leads to a (stochastic) user equilibrium, as optimization is performed in terms of individual scoring functions and within an agent’s set of plans.







