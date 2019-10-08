# Projet-JEE2019_Groupe2-3
Système de réclamations des dangers


Etude analytique :


Cette phase nous a permis de poser correctement le problème à résoudre et les objectifs à atteindre.

•	D’abord, Qu’est-ce qu’un risque ?

	Un risque est un danger éventuel plus ou moins prévisible, qui peut affecter une activité.
On parle des différents types de risques selon l’activité :
           Risque d’avoir un accident           
           Risque d’être agressé       
           Risque d’être mordu par une bête sauvage             
           Risque d’avoir un incident.
           
•	Tout le monde aura accès à toutes les fonctionnalités d’utilisateur juste en étant inscrit dans la plateforme, c'est-à-dire, toute personne ayant un compte et un mot de passe correcte verra le contenu du site. (Cf. Identification des acteurs, page suivante).

•	Les fonctionnalités offertes par l’application sont les suivantes :                         
Identification : c'est-à-dire la connexion ou la déconnexion de la session.  
  - Plusieurs fonctionnalités sont offertes à tous les utilisateurs qui arrivent à se connecter avec succès :
       *Réclamer un risque : S’ils étaient victimes d’un risque, ils peuvent bien le réclamer sur le site.
       *Consulter les statistiques des réclamations : Les utilisateurs peuvent éventuellement consulter l’ensemble des statistiques des dangers dans certains lieux ou pendant certaines périodes. Cette fonctionnalité est associée aux deux autres sous-fonctionnalités : Signaler & Confirmer. Signaler : Dans le cas ou les statistiques paraissent fausses et Confirmer dans le cas contraire. Dans le cas d’un simple visiteur non inscrit dans le site, il peut consulter les statistiques des réclamations sauf qu’il ne pourra pas donner son avis à propos de ces statistiques.
Créer un nouveau compte : Les visiteurs du site web qui souhaitent s’inscrire pour bénéficier des fonctionnalités avancées de l’application, peuvent créer un nouveau compte.
Recevoir des warnings : S’il une personne annonce qu’elle est en situation de risque ou elle a assisté à un danger, tout le monde verra un une fenêtre (pop-up) pour le prévenir de ce danger, ce pop-up contiendra des informations pertinentes, surtout : le lieu du danger et le temps.
Consulter les réclamations : L’administrateur du site peut consulter toutes les réclamations qui sont déjà faites par les utilisateurs du site.
Faire le broadcast des risques : Quand il reçoit une nouvelle réclamation, en plus de la partager sous forme de warning, il peut aussi l’envoyer à tous les utilisateurs dont leur mail est sauvegardé dans la base de données. 
Modifier les statistiques : Suivant les avis des utilisateurs à propos des statistiques (les fonctionnalités : Signaler & Confirmer), l’administrateur peut faire une décision concernant la pertinence de ces statistiques et ainsi les modifier s’il le faut.
Désactiver un compte : L’administrateur peut bien désactiver un compte d’un utilisateur précis sous plusieurs conditions, par exemple ; si l’utilisateur concerné réclame plusieurs fois un danger qui n’a pas eu lieu.
                                      
•	Plans de tests :   

Plan de tests de validation pour les fonctionnalités :
	Créer un nouveau compte.
Donnée : un mail erroné ou ne pas respectant la syntaxe des mails (xx@xx.xx) ou un CNE non valide (On suppose que nous avons la base de données de tous les CNE existants).
Résultat : Message d’erreur « Veuillez renseigner des informations valides ».
	Ajouter une nouvelle réclamation.
Donnée : ajout de réclamation incomplet.
Résultat : Message d’erreur « Veuillez renseigner toutes les informations demandées ».
	Consulter les statistiques des réclamations (1).
Donnée : Date ou lieu erronés.
Résultat : Message d’erreur « Veuillez renseigner des informations valides ».
	Consulter les statistiques des réclamations (2).
Donnée : Aucune statistique trouvée.
Résultat : Message d’avertissement « Historique vide dans cette période ou dans ce lieu ».
	Connexion au site.
Donnée : Mot de passe ou CNE ou mail invalide.
Résultat : Message d’erreur « Veuillez insérer un mot de passe valide » ou « Veuillez insérer un mail valide » ou « Veuillez insérer un CNE valide » suivant l’emplacement de l’erreur s’il est dans le mail ou dans le mot de passe ou dans CNE.
-	Identification des acteurs :
Un acteur est l'idéalisation d'un rôle joué par une personne externe, un processus ou une chose qui interagit avec un système.
Type d’acteur	Description fonctionnelle

              Utilisateurs	C’est toute personne pouvant se connecter au site web en utilisant son CNE/Mail avec mot de passe valide.
       Public/Visiteur	C’est juste un visiteur du site web, mais qui ne pourra pas accéder aux fonctionnalités du site.
       Administrateur	C’est celui qui gère le tout dans le site.




Les patrons et Outils de travail, frameworks choisis :

MVC Design Pattern:

Modèle Vue Contrôleur (MVC) : C'est un modèle de conception qui entre en image lorsque nous utilisons le framework Spring pour la programmation Web. Spring MVC est connu pour être une implémentation légère, car les contrôleurs sont des POJO par rapport aux servlets classiques, ce qui rend le test des contrôleurs très complet. Un contrôleur renvoie un nom de vue logique et la sélection de vue à l'aide d'un ViewResolver séparé. Par conséquent, les contrôleurs Spring MVC peuvent être utilisés avec différentes technologies d'affichage telles que JSP, etc.

Spring Boot: back end framework, Angular 4: front end framework using typescript, Maven.

![alt text](https://user-images.githubusercontent.com/39934426/66365879-750a2780-e986-11e9-8ce2-ed37d72d1497.png)
![alt text](https://user-images.githubusercontent.com/39934426/66365880-750a2780-e986-11e9-81ae-ea4178a41677.png)
![alt text](https://user-images.githubusercontent.com/39934426/66365881-750a2780-e986-11e9-80cc-8fdf857b5236.png)
![alt text](https://user-images.githubusercontent.com/39934426/66365882-750a2780-e986-11e9-9213-f985e65ed8f3.png)


Creating Your First Angular 4 App Using Eclipse IDE
https://www.genuitec.com/creating-first-angular-4-app-using-angular-ide/
Integrate Angular with Spring Boot RESTful API tuto
https://www.evoketechnologies.com/blog/integrate-angular-spring-boot-restful-api/
https://www.devglan.com/spring-boot/spring-boot-angular-example
https://www.devglan.com/angular/angular-7-crud-example
