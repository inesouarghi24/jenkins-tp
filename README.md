reponse au questions

1. Comment automatiser la qualité avec les "Quality Gates" dans SonarQube ?
Le QualityGate est un ensemble de conditions (par exemple : "Couverture de code > 80%", "Pas de nouveaux bugs") définis dans Sonar pour garantir la qualité de notre  projet.

Lors de notre TP, nous avons remarqué que même si le QualityGate était "Failed" (Rouge) sur SonarQube (à cause de la couverture de 33.3%), le build Jenkins était "Success" (Vert). 
Le pipeline n'était donc pas totalement automatisé, car il ne voyait pas l'échec du test de  la qualité.

Pour automatiser la qualité, nous devons forcer le build Jenkins à échouer si le Qualitygate de Sonar échou.
On y arrive en ajoutant une étape au Jenkinsfile qui attend le résultat de l'analyse de SonarQube avant de continuer.

2. Comment intégrer le Code Review dans le pipeline ?
L'intégration de la revue de code  consiste à utiliser le pipeline pour analyser automatiquement
le code avant qu'il ne soit fusionné dans la branche principale (main).
Cela se fait en connectant Jenkins et SonarQube aux Pr sur Git

Le processus est le suivant :

Le Développeur : Au lieu de pousser son code directement sur la branche main, le développeur crée une nouvelle branche (ex: feature/fix-divide-bug)
et ouvre une PR pour demander la fusion de son code dans main.

Jenkins : On utilise un type de projet "Pipeline Multibranche". Jenkins détecte automatiquement la création de cette PR et lance un build spécifique pour cette branche.

SonarQube : SonarQube effectue une Analyse de Pull Request. Il n'analyse pas l'ensemble du projet mais que les lignes de code nouvelles ou modifiées dans la PR.

Integration et Feedback :
Jenkins poste un statut sur la page de la PR GitHub 
ex: Build: Success.
SonarQube poste un commentaire et un statut sur la PR 
Revue Humaine : Un autre développeur le reklecteur peut alors examiner la PR
Il voit les modifications du code mais aussi les rapports automatisés de Jenkins (tests) et de SonarQube (qualité) avant d'approuver. 
On peut même bloquer la fusion de la PR tant que tous les voyants ne sont pas au vert.
