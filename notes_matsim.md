# Notes
### Cycle de MATSim

- mobility simulation: queue-based teleportation PT optional (matsim simulation voiture - pas de pietons)
  - teleportation: distance euclidiane (ideia de teletransportar)

- Score
  - positive score for activities, negative scor for trips
  - o que queremos fazer são as atividades por isso positivo

- Replanning
   - sempre buscar a melhor opção, por isso que faz este loop

### Exécution (execution)
- exécution: calculer le moviment des véhicules 
  - eu fico aqui esperando o carro, 
- tâche: 

### Scoring
- évaluation de la situation physique dans le réseau (utilité, socre, coûts, généralisés (negatifs))
- tâche:
   - évaluation d'un plan exécuté
   - fondement de la probabilité de "survie" du plan

```
plus de complexité: plus de temps de calcul
plus d'information: difficile de mesurer
```
### sélection
algorithm evolutif - survie

### replanning
- replanning
  - la manière dont les plans sont mutés/modifiés/adaptés (pour la création d'un nouveau plan)
- tache

> LA SIMULATION ELLE MÊME C'EST L'ALGORITHM QUE PARLE - DONC TOUT LE LOOP C'EST L'ALGO
- routes: variations de l'algorithme (à chaque interation on utilise Dijkstra dynamique (best reponse) 

por exemplo eita vou pegar esse onibus pq é mais rapido, mas e se todo mundo pensar igual? 

- horaire: variation aléatoire des heures

- modes: w

- localisation des activités secondaires:
  - choix aléatoire

### évolution & coévolution

  - population of individuals 

> eles usaram o algoritmo genétique 

> OS INDIVIDUOS PROCURAM PARA OTIMIZAÇÃO PRÓPRIA E A SIMULAÇÃO FAZ ISSO, MAS O RESULTADO GLOBAL TEM UM SCORE QUE NÃO NECESSÁRIAMENTE É O OPTIMAL POUR CHAQUE AGENT (INDIVIDUO)

> SCORE: A SIMULAÇÃO IRÁ PARAR QUANDO A CURVA DE SCORE CHEGARÁ NO EQUILIBRIO

O QUE QUEREMOS TER NA SIMULAÇÃO
- Interação fisica entre os agentes
- representaçÃo temporal e spacial do sistema de transporte real
- Simulation de: comportamento da congestion, comportement aux carrefours etc..
- variables décriavant les conditions du réseau (flux, temps de trajet, retard, etc.)

> Existe um problema!
- Trade-off: entre o réalismo e o tempo de calcul
- plus de réalisme donc plus d'événements (réactions à des situations qui ...

### TYPES DE SIMULATION
queue model - fille d'attente
 gráfico vitesse vs résolution
 maior résolution menos velocidade para o resultado
 
 



