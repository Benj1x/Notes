# Systems Development/System Analysis and Design

This class, has a lot of sections where everything in it seems important to me, sometime just for some context. Therefore, this class will probably just have a lot of what seems like copy pasting instead of just 'this one sentence seems important' kind of notes.

# Lecture one

## Method

### Objects and Classes

In OOA&D, the basic building block is an object. During analysis, we use 
objects to organize our understanding of the system's context. During design, we use objects to understand and describe the system itself. In each 
case, the definition is the same:

***Object:*** *An entity with identity, state, and behavior.*

In analysis, an object is an abstraction of a phenomenon in the system's context, such as a customer. The object expresses the users' view of reality: Certain people are customers, and they are treated as single entities with a specific identity, state, and behavior. In design, an object is part of the system. A customer can also be a design object. In design, the customer object would represent parts of a specific person's history and state within the system and make operations available for oth er system objects.

Typically, we describe objects in terms of classes, rather than individually. For example, a system's customer class might contain specific customer objects, such as the user's mother or neighbor, but the same class will also contain many other customers, each with their unique identity, state, and behavior. Classes are useful for understanding objects and vitally important for describing them. Instead of describing each particular object, we develop a shared object description for all objects in the same class.

***Class:*** *A description of a collection of objects sharing structure, behavioral pattern, and attributes.*

### Analysis and Design Objects

Analysis and design often share objects and classes, although the object's meaning changes. 
An analysis object's identity expresses how the user differentiates it from the other objects in the context. 
A design object's identity expresses how other objects in the system can recognize it, and thereby gain access to it. Design also gives rise to new classes. Such classes do not reflect the system's context, but they are important for implementing the system on the technical platform.

Object behavior is the decisive difference between analysis and design objects. In analysis, we express an object's behavior by the events it performs or experiences. Customer objects are, for example, involved in ordering and shipping goods. Such events (order and ship) occur at definite points in time, and involve one or more classes of objects (customers and goods). The events help us understand how and when to change a system's representation of an object.

In design, we express an object's behavior by the operations it can carry out and make available to other objects in the system. Customer objects, for example, can represent information about real-world customers. Such objects have operations, such as "add order'' and "remove order," which let the system update the customer object's state as the real world changes. A design object encapsulates the internal representation of its state. The representation is hidden so other objects can only access the object's state (which 
goods are ordered) through its operations (add order and remove order) An operation is defined as a process capability in a class and activated through the class' objects.

Analysis and design objects describe two clearly different matters. 
**Analysis objects describe** phenomena outside the system, such as people and things, which are typically independent. Although we cannot always command them, we must register the events they perform or experience. <br>
**Design objects describe** phenomena within the system that we can control. We describe their behavior as operations for the computer to carry out

### Advantages of Object-Orientation

Objects, state, and behavior, are more general concepts and are suitable for describing most phenomena that can be expressed in natural language. Objects are similar to nouns, designating things such as people or inventory. Object attributes or states, like adjectives, characterize object traits. Object behavior, like verbs, describe actions or influences
For example:<br>
"The house looked nice after Bob painted it." This closely parallels the object-oriented way of thinking. <br>
There are two objects (the house and Bob), a common event (painting the house), and one of the objects has changed state (the house has become nice)
<br>
Here we touch upon a primary strength of object-orientation: It provides clear information about the system's context. <br>
<br>
Another strength of object-oriented methods is the close connection between object-oriented analysis, object-oriented design, object-oriented user interfaces, and object-oriented programming. Objects can model social, economic, and organizational conditions, as well as the system's interfaces, functions, processes, and components.
<br><br>
And lastly; Objects provide material coherence to the system's structure. They also provide mental coherence: Objects offer developers a natural way of thinking about problems that support abstraction without forcing a one-sided, technical point of view.
<br>

### Model the Context
<br>
Success in system development greatly depends on the developer's understanding of the system's practical application. As the figure below shows, the system's context can be viewed from two complementary perspectives: the system models something (the problem domain) and it is operated by users (the application domain).

![The system context](imgs/SAD/SystemContext.png)

We define these two different, but strongly related context perspectives as follows:

***Problem domain:*** *That part of a context that is administrated, monitored or controlled by a system.*

***Application domain:*** *The organization that administrates, monitors, or controls a problem domain.*

The problem domain describes the system's purpose, as well as the parts of reality that the system should help administrate, monitor, or control. The application domain is a part of the user organization. A system's success (or failure) depends on how well it links the application and problem domains together into a functioning whole.
<br><br>

**A few examples of the problem domain and application domain would be:**<br>
For a payroll system, the application domain includes the personnel office, while the problem domain includes the employees, their contracts, and 
their work schedules. <br>
For an air traffic control system, the application domain is a part of the air traffic controllers' job, while the problem domain includes planes, flight departures, flight corridors, runways, flight positions, and movements.<br> 
For a device for measuring telephone signals, the application domain is part of the technicians' job, and the problem domain includes signals, protocols, lines, transmitters, and receivers.<br><br>

A key task in analysis and design is **to model what the system will administrate, monitor, or control.** <br>
For example, in an air traffic control system, this includes airplanes, flight departures, flight corridors, and positions. The air traffic controllers' job consists of monitoring and controlling the air traffic using the system's information about these objects. <br>
Controllers use this information, rather than direct observation of aircraft movement, as a basis for decision making. Their understanding of air traffic consists of both the actual situation in the air, and the way they think and talk about the traffic in technical terms.<br>
Because the controllers' understanding of the problem domain is both created and maintained through the system, the problem domain and the system's model of the problem domain must agree completely. This is a crucial quality requirement. It is also crucial that the system's model is organized in agreement with the air traffic controller's structural understanding. Thus, in this and all cases, system developers should analyze the problem domain, both to understand the system's context and to learn how to 
usefully representing it to the system's users.<br>
### Emphasize the Architecture

Understanding the context is important, but it is equally important to understand the system itself. We view the system as an entity adapted to solve identified needs for a specific technical platform:<br><br>
***System:*** *A collection of components that implement modeling requirements, functions, and interfaces.*
<br><br>
During analysis and design, it is essential to develop an overall understanding of the system. OOA&D therefore emphasizes the system architecture as a key challenge, focusing on ease of understanding, flexibility, and usefulness.<br>
The system architecture should be easy to understand because it serves as the basis for decisions and as a communication and work tool in the development work ahead. It should be 
flexible because system development takes place in a turbulent environment. Finally, the architecture sh ould be useful because the system's success depends on the role it will play in the user organization.<br>
However, these general criteria do not specify when a design job is finished. The main purpose of OOA&D is to design a system without significant uncertainties.

A reasonable architecture gives us an overview of the system. Even small systems contain so many classes and objects that the system easily becomes unwieldy. As a tool for handling system complexity, OOA&D uses components, which are groups of classes and objects. <br>
Identifying the relevant components in a concrete system is a crucial issue in object-oriented design. The choice of architecture will always reflect the concrete situation, and selecting one is a highly iterative process. In OOA&D, we start with a very basic architecture with three components: a model component, a function component, and an interface component.

### Tailor the method

OOA&D reflects four central perspectives on a system and its context:

* The system's information contents 
* How the system will be used
* The system as a whole 
* The system's components

The perspectives are connected to OOA&D's main activities:

* Problem-Domain analysis
* Application-Domain analysis
* Architectural design 
* Component design

Each activity leads to specific results, which are subsequently included in the analysis and design documentation. 
How you organize and document these activities will depend on how you tailor OOA&D to the needs of your project.

### Four methods

First understand the system from an information perspective: *The system must offer a useful model of the problem domain.*<br> 
It should contain a model of the relevant problem-domain. This information perspective is predomiant during analysis. But the perspective is also important during design 
since the system should make the model available in an efficient and useful manner.

The system is next understood from the user's viewpoint: The system must be integrated in the application domain. We must understand the people, devices, and other systems that the target system will interact with, and which functions to offer these actors. 
Relations such as how, how quickly, how often, and in what pattern different actors should interact with the system are crucial for system usability. A well-functioning system is integrated with other systems and adapted to the organization and the traditions in the application domain.

The third perspective is the architectural perspective: 
The system must run on a specific technical platform. How should the system be divided into components? Important considerations include the physical processes, units, and connections that make up the technical platform. How should the system use this platform? An architecture emphasis helps you determine how best to take advantage of a platform's possibilities and overcome its limitations.

Finally, the system should be understood as a whole: The system should be a well-functioning unit of cooperating parts. The individual components and their mutual interfaces and interactions should be designed to serve as a basis for system implementation.

### Four Main Activities

OOA&D covers the four perspectives through four main activities, shown in the below figure.
![The activities and results in OOA&D](\imgs\SAD\FourMainActivities.png)
Analysis and design are always strongly iterative, wherein considerations based on one perspective give rise to new considerations based upon another perspective. The four activities' relative importance and sequence changes from project to project. In some projects, the application-domain analysis is characterized by great uncertainty. The project might, for example, be based on a new interface technology that is unfamiliar to both users and developers.<br>
In other projects, the architecture is characterized by great uncertainty, perhaps because the system is to be implemented on a recently distributed platform. Therefore, the priority and organization of OOA&D's main activities depends on the situation.<br><br>

The system should be in balance with its context. But how can you achieve this? The obvious place to start is with the most important perspective. Thus, you must assess the actual situation and decide which perspectives you should emphasize. In practice, an activity's order and importance are controlled by a strategy that reflects the concrete goals and circumstances for analysis and design. How to develop such a strategy for particular projects will be discussed in Lecture 7, or chapter 15 of "Mathiassen, L., Munk-Madsen, A., Nielsen, P. A., & Stage, J. (2000). Object-Oriented Analysis and Design. Marko."
<br><br>
OOA&D's four main activities are abstract tasks that you can perform together with other tasks in a practical system development project. How you organize these tasks depends on strategy, which differs from project to project. <br>
Figure 1.5 shows a traditional, top-down approach based on OOA&D; Figure 1.6 shows a use-case-driven approach, also based on OOA&D. OOA&D offers a systematic and complete approach to object-oriented analysis and design. Principles constitute OOA&D's central and unchangeable parts, while techniques and notation act as their concrete realization. The method was designed so that you can easily adapt it to local traditions. 
and supplement it with elements from other methods;  
![A traditional top down approach based on OOA&D 1.5](TraditionalTopDownApproach.png)

### Results

The tangible result of analysis and design is documentation, which helps 
you practically manage the actual analysis and design activities. Documentation provides a reference tool for the developers, and a place to store and organize intermediate results. It also contains agreements between the project participants. Documentation helps create continuity during system development, and thus must be of high quality. At the same time, it should be clear and concise. It requires significant effort to create high quality documentation and an overly detailed design document will not inspire creativity and effectiveness in programmers.<br><br>
Whether or not documentation is contained in one document or two is less important in the OOA&D approach. OOA&D produces both an analysis and a design 
document. In Chapter 16, of "Mathiassen, L., Munk-Madsen, A., Nielsen, P. A., & Stage, J. (2000). Object-Oriented Analysis and Design. Marko." a detailed template for each is provided, which you can use as inspiration for designing the documentation for your own projects.

### Unified Process and Notation

OOA&D clearly differ entiates between guidelines for process and those for notation. This separation lets you use the approach regardless of the object-oriented notation you choose. OOA&D also differentiate between general principles and concrete techniques. It's primary emphasis is on principles; OOA&D uses techniques to illustrate how to implement the principles. Classical methods have often given directions that were too detailed and not always valid; they also tend to disregard equally usable alternatives. The advantage of a 
principle-based presentation is that you can substitute your own techniques when the task or terms dictate it.<br>
<br>
The choice of UML yields two important advantages. First, UML, like OOA&D, builds on a division between process and notation, so there are no built-in process guidelines in UML to consider. Second, UML's broad support gives you access to a large market of UML-compatible development tools. <br>
The Unified Software Development Process is related to, but independent of, UML. The unified process represents one way to organize object-oriented projects that is use-case driven, architecture-centric, iterative, and incremental. A use case is a particular technique for application-domain analysis. Lecture 5 Chapter 6, it will be discussed that OOA&D builds on similar, but more general principles. <br>
Figure 1.6 shows a use-case-driven, architecture-centric, and incremental approach based on OOA&D. As compared with the traditional, top-down approach in figure 1.5, we see differences and similarities.
![A use-case driven, architecture-centric, and incremental approach based on OOA&D ](../Notes/imgs/SAD/UseCaseDrivenApproach.png)

The traditional approach is driven primarily by problem-domain analysis, whereas the unified approach is driven primarily by application-domain analysis (that is, 
by use cases). The traditional approach emphasizes analysis, design, and programming of the entire system, whereas the unified approach is incremental, focusing on analysis, design, and programming of one system part at a time. Both approaches however are iterative and stress architectural concerns. <br> <br>

Ultimately, you must identify the uncertainties you face and organize the process accordingly. Sometimes, this will lead you to take a highly incremental approach; other times, a more traditional one. Also, some projects require more focus on application-domain knowledge, while others require an emphasis on the problem domain.

## System Choice

As you might know development projects often begin with a collection of different ideas about the desired system. It might start with a thorough preliminary analysis or with a list of decisions that h ave already been made. It is the system developers' job and responsibility to take a step back and consider the main questions. <br>
What are the problems we are going to solve? Is the planned system a useful solution? What if we developed an entirely different system? <br>
In this section, it will be explained how you can take this step back. It will describe how to systematically examine project challenges and options, and 
how to obtain relevant and precise information as a basis for analysis and design. Techniques that can help you create different alternatives are also introduced. These techniques can help your development team thoroughly consider a project situation and arrive at a short and precise definition of the planned system. Although the development team should always analyze, formulate, and evaluate possible solutions, in the end customers and users are responsible for choosing the system.

### System Definition

In order for us developers to design solutions for many of the challenges we will stumple upon during project development we must understand the structures, relations and details of the user organization, and evaluate and manage relevant technologies in a proffesional manner. We should also know how to operate in constantly changing situations with new requirements, ideas and possiblities.
Some development projects arise from problems that needs to be solved, some of these problems, might have been defined and desribed perfectly, while some have just been vaguely identified. So at the begining of development projects we must try to 'find. define and analyse in detail' (see: explicate) the most important challenges in the project. To do so, we explicate can explicate and debate alternative system definitions.
<br>
**System definition:** *A consicise description of a computerized system expressed in natural language*
<br>
A system definition expresses funndamental properties for system development and use. It describes the system in context, what information it should contain, which functions it should provide, where it is going to be used, and which conditions the system should be developed under.
<br> <br>
The intention of such a definition is to explicate different interpretations and possibilities. System definitions help maintain an overview of different options, and you can use them to compare alternatives. When a system defintion has been selected, it should also be used as an indispensable foundation for continuing the analysis and design activities. <br>

A system definition should be breif, precise, and contain the most fundamental decisions about the system. Creating breif system definitions, provides an overview and makes it easier to compare alternaties. Longs definitions makes this harder.
In this lecture we will also be introduced to the FACTOR criterion for system definitions. Each letter refers to a key element in the system definition.

#### <span style="color:Red">FACTOR</span>

The factor criterion consists of six elements: <br>
*Functionality:* The system functions that support the application-do-main tasks.<br><br>
*Application domain:* Those parts of an organization that administrate, monitor, or control a problem domain. <br><br>
*Conditions:* The conditions under which the system will be developed and used. <br><br>
*Technology:* Both the technology used to develop the system and the technology on which the system will run.<br><br>
*Objects:* The main onbjets in the problem domain. <br><br>
*Responsibility:* The system's overall responsibility in relation to its context.
These elements describe, in a coherent manner, the most fundamental decisions involved in creating a sound computerized solution.
The FACTOR criterion can be used in two ways. You can use it to support system-definition development, carefully considering how each of the six elements should be formulated.  Or you can start your definition by describing the system and then use the criteria to see how the system definition satisfies each of the six factors. "In principle either starting point works" -Jan
![Subactivities in choosing a system](/imgs/SAD/SubactivitiesChoosingSystem.png)
### Choosing the system
As Figure 2.1 shows, system choice is based on three subactivities.
The first subactivity focuses on challenges: we attempt to get an overview of both the situation and the different ways people interpret it.<br>
The second subactivity creates and evaluates ideas for system design. This method offers a series of techniques to support creativity and introduce new ways of thinking.<br> 
In the third subactivity, we formulate and choose the system definition, discussing and evaluating alternative system definitions in relation to our particular situation.<br><br>

We produce a system definition by iterating through the three subactivities. In this process, an interaction occurs between our situational understanding and the generation of innovative ideas. An idea's relevance is intrinsically tied to the project situation. Conversely, describing the situation typically gives rise to new ideas. The process of composing and choosing system definitions also affects the other subactivities, revealing circumstances that we must closely examine and ideas we must further explore.
<br> <br>
Choosing which system to develop is a demanding activity. It requires imagination, good ideas, constructive abihties, and a critical sense. To succeed, we must start out from the users' situation and thoroughly understand its challenges. This demands close cooperation with customers and users. Without this foundation, it is difficult to propose relevant solutions. At the same time, we must reflect critically on users' requirements and ideas, particularly if they point toward one specific solution. The users' 
knowledge and experience with computers, the organization's structure, and the existing computerized systems are factors that can complicate a project.

### Describe the Situation
Our understanding of the users' situation must be rich and abundant. To achieve this, we must be open and disposed toward discussion. Thus, we emphasize the following principle:

**Principle:** *Appreciate the situation.*

By working with "rich pictures," we can explicate important user views of a situation, facilitate debate, and get an overview of the situation quickly. The purpose here is to obtain an overview. 

### Rich Pictures 
A rich picture is an informal drawing that presents the illustrator's understanding of a situation. Figure 2.2 shows an example of a rich picture from a hospital's system development project. The rich picture describes a change from six autonomous wards to a new structure in which the wards become part of a larger unit. The purpose of this organizational change is to improve coordination and resource sharing among the wards. <br>
A rich picture focuses on important aspects of the situation, which are determined by the illustrator. However, the rich picture should give a broad description of the situation that enables several alternative interpretations. For example, Figure 2.2 shows the increased efficiency that reorganization could bring. It also lets us look at the individual ward: Does it continue to be an efficient entity, or will responsibility become more difficult to assign among the six wards? We can also consider the impact on employees. How will the expected decline in ward-affiliation affect their work? <br>
Finally, we can focus on changes in managerial forms. The crossed swords in the figure indicate conflicts between the old and new organization, and are relevant in each of the four perspectives. <br> <br>
![Figure 2.2: Example of a rich picture with focus on change](imgs/SAD/RichPictureExample.png)<br>
System development changes are typically not as radical as in the hospital case. Given this, it can be practical to differentiate between rich pictures that focus on stability and those that focus on change. In the former case, a rich picture might describe, in greater detail, a situation that remains stable. An example of this is the way in which an emergency vehicle is dispatched; a rich picture of this is shown in Figure 2.3. The second category describes a transformation between two situations: something exists and something is coming. 
![Figure 2.3: Example of a rich picture which focuses on stability](imgs/SAD/StableRichPictureExample.png)<br>
Coming up with good symbols for drawing rich pictures can be difficult. Figure 2.4 contains some options. The lower part shows symbols you can use to describe things and people; the upper part, symbols you can use for processes and structures. In principle, there are no limits to the types of symbols and icons you can use. The biggest problem for the novice is lack of imagination. Figure 2.4 can be used as inspiration- but the best way to learn how to make rich pictures is to try it and to learn from others.<br>
![Figure 2.4: Ideas for symbols for rich pictures](imgs/SAD/IdeasForRichPictures.png)

### Practical Advice
To be a useful part of system definition, rich pictures should: 
• contain a lot of information and be open to interpretation; <br>
• present processes and structures in a coherent, well-balanced way; <br>
• show at least one problematic area; <br>
• point at several relevant computerized systems; <br>
• be rich, but not chaotic; <br>
• illuminate key aspects of a situation in a way that promotes understanding at many levels<br>
• avoid representing data and data processing. <br>
<br>
Pre-analysis should help create and integrate different ideas for computerized solutions. The rich pictures can thus enable participants to get ideas and bring creativity into the project. Rich pictures should also provide an overview, rather than show too many elements and thus become chaotic. It is better to draw several pictures, especially if the situation is very complex. Finally, it is important to remember that rich pictures are personal. <br>
The illustrator of the rich picture decides what is relevant to draw. Different viewpoints lead to new pictures.<br>

### Create ideas
A solid understanding of the existing situation is a good starting point for a development project,. However, it is just as important to bring forth new 
ideas and ways of thinking, which is the second subaclivity in system definition. Good systems ar e created in the tension between tradition and creativity. OOA&D therefore stress the following principle:

**Principle:** *Cultivate new ideas.*

The result of this subactivity is a collection of ideas. The ideas describe parts of a computerized solution that can be summarized in one or more system definitions. The activity of cultivating ideas can only be systematically planned to a certain extent. Many ideas surface because some people are full of ideas. Other ideas come about as a result of coincidence or abstract thinking. We recommend being open to all new ideas. Too often, ideas are discarded without being properly evaluated. <br>
The goal is to attempt a balance between creating new ideas and reusing well-established ones. New ideas should be cultivated in close cooperation with future users, 
who know both the application domain and their organization's traditions and culture. Without a thorough understanding of the user's context, ideas are likely to be general and abstract.
To generate and evaluate ideas in cooperation with the users, it is suggested to use: <br>
• exemplars <br>
• metaphors<br>
• experiments. <br> 
Exemplars provide a concrete way of creating new ideas. By studying similar systems, you can explore specific ideas that apply to your situation. Metaphors increase your understanding by presenting the user organization in new terms. This can bring entirely different ideas and experiences to the situation. Finally, you can use experiments, in cooperation with users, to assess possible solutions

#### Exemplars
When you develop a new system, OOA&D advises you to look at existing solutions that resemble the one that users desire. If you need a new accounting system, it's a good idea io study an existing system's design and use. You can do this by visiting another organization or by studying standard systems on the market. For every existing solution, try to answer the following questions:<br>
• Which ideas lay the groundwork for the system?<br>
• Do the ideas seem useful? Why?<br>
• Will the ideas work in your context? Why?<br> 
• Can the ideas be adapted to your system? How?<br> 

#### Metaphors
In metaphorical design, we view a user organization or a computerized system through a new lens. For example, we might look at a library system through the lens of an inventory control system. To do so is an easy way to break down habitual thinking. You do not need to develop prototypes or organize visits to other organizations-this is a purely intellectual exercise that you can do at the desk or at a project meeting. <br>
Metaphors help transfer ideas and experience from other areas. An inventory system typically keeps track of three things: receipt of goods, location of goods, and shipment of goods. How does this relate to a library? By trying to answer this question, you can expand and enrich your understanding of the library system's potential properties. <br>
OOA&D recommend working with several metaphors. For example, you might view a library as a warehouse, a store, a school, and a meeting place. <br>
Each of these metaphors will give rise to a richer understanding of the library by emphasizing different features of the library. This will give rise to many different ideas for computer support. The difficult part of metaphorical design is to find the metaphors. Once you find them, we suggest following three simple steps: <br>
1. Create a long list of aspects related to the metaphor. 
2. Transfer these aspects to your target system. 
3. Determine which of the aspects might be useful.

#### Experiments
An experiment is a planned examination of the target solution's properties. 
The experiment more or less resembles the users' daily work. OOA&D proposes an experiment based on prototypes. The fundamental requirement of the prototype is that it be easy to implement and modify. <br>
These requirements are easily met with prototypes that are not computer based. For example, you can draw a screen on a piece of paper and use a sequence of screen pictures to illustrate system use. You can draw screen pictures on transparencies and display them. These prototypes can also be supplemented with cardboard boxes representing terminals, printers, and other artifacts.<br>
One problem with these kind of prototypes is that they do not function on their own; you have to simulate system processes. Thus, if it is technically or economically viable, OOA&D recommends working with computer-based prototypes.

#### Preparation
The purpose of developing a prototype is to test it. You should therefore carefully prepare your tests. To make exploratory experiments realistic, future users should carry them out. A realistic test requires a concrete understanding of, and exhaustive experience with, the work that the prototype is to support. Only potential users have this concrete understanding. <br>
During prototype preparations, you must make decisions about: <br>
• cooperation, <br>
• realism, and <br>
• selection. <br>

Determine how users and developers will work together. Your tests can be based on observation, where developers watch while users try out the prototype. Alternatively, you can conduct the test as a discussion between users and developers. Next, you should decide how realistic the test will be. It can be detached from the users' daily work or integrated, so that users actually use the prototype while they work. You can then decide which users should participate and who they represent.

#### Test
The test consists of using the prototype in the chosen surroundings. Once you begin the evaluation, there are very few possibilities to intervene and change the process or the prototype. In many situations, it is difficult to repeat a test. Therefore, you should be sure everything is ready for conducting the test, and for documenting the test. <br>
For documenting the test the user can write a diary based on themes and subjects, this is great when a developer is the tester, but not as good when it isn't, since 'ordinary' people not always understands what the developers want to learn. It can also be recorded, but it might contain too much irrelevant data.

### Define Systems
The purpose of the third and final subactivity is to choose the actual system 
to develop. You do this by systematically clarifying interpretations, possibilities, and consequences of several alternative solutions. Hence, the following principle: 
<br><br>

**Principle:** *Define alternative systems.*
<br><br>
The two previous subactivities should give you as many interpretations and 
possibilities as the situation allows, creating an array of new ideas for solutions it can be difficult to maintain an overview of all alternatives and make consistent choices about which ideas to pursue.  <br>
It is recommended precisely summarizing the general properties of potential target systems by formulating the properties into system definitions, which are brief, precise descriptions of solutions expressed in everyday language. 
<br>
"Systems Are Holistic Views"
A system definition expresses a perspective on something. A single computer application can be viewed in several different ways, depending on how it is used. Designers understand an inventory system in a certain way; they might emphasize, for example, how the system relates to users' jobs. The database administrator might have a third view, emphasizing data and its relation to other parts of the database. 
<br>
Every system definition represents a specific perception of the real world filtered through the ideas, conceptions, educations, and backgrounds of the people involved.<br>
A system definition describes a totality, or a whole. It is an overall systems view, which focuses on how all the parts and components interact. A system definition will ther efore express emergent, system-focused properties, rather than detailed, component-oriented properties. User friendliness is an example of an emergent property. It makes sense only when looking at the system as a whole; no part of the system has this property in itself. <br>
A system definition also reflects specific limitations. We limit some aspects by placing them outside the system, and limit some details by focusing on others. <br>
Before choosing a system, you should work with several different ones. 
If you consider alternatives and include different interpretations and beliefs, you give everyone involved a fair chance of making a useful choice. <br>
The quality of the system you finally decide on can then be evaluated relative to the other systems you've considered. <br>

### Lecture one TL:DR;
A system definition describes a computerized solution in context. Using the 
Conference Planning System, the following definition was formulated: <br>
**System definition 1:** A computerized system used to prepare and plan an IFIP conference, with emphasis on administration of participants, articles, and the program itself. The system should primarily be an administrative tool, but secondarily serve as a communication medium for the program committee, the organizing committee, and the local administrative personnel to help them manage the conference. The system should be based on a cheap PC with current tools. The system should also be able to function in different types of environments, including use by volunteers who have great enthusiasm and greatly variable administrative experience. 

When writing your system definition, it is important to be both brief and precise. In the above example, it is no accident that it states "used to prepare and plan"; it would be a different system if only planning, which is a primarily intellectual activity, had been emphasized. Preparation includes all the practical tasks related to hosting a conference. Given this, we might consider other relevant system definitions, such as: <br>
**System definition 2:** A computerized system used to control an IFIP conference by registering participants and their payments to organizers using invoicing and other reporting methods. Controlling should be easy to learn, as IFIP conferences use unpaid and untrained labor. The two definitions relate to the same situation but are extremely different.<br> 
The first emphasizes preparation and planning, while the second focuses on 
the economic exchange between conference organizers and participants. 
<br><br>
The following tips can help create useful system definitions: 
• Use general terms and focus on emergent properties. 
• Focus on ideas rather than describing the situation as it is. 
• Make the definition brief and precise. 
• Experiment with several system definitions. 
• Go beyond habitual ways of thinking. 
• Use the selection process to discover additional relevant properties. 
Users have a hard time relating abstractly to information-technology use, and system developers often focus on familiar solutions. Concrete experience from using exemplars, metaphors, and experiments with prototypes can help everyone generate new ideas. To evaluate the relevance of the system definition, you must discuss the system's pros and cons.
<br><br>
The FACTOR criterion consists of six elements: <br>
**Functionality:** The system functions that support the application-domain tasks. 
**Application domain:** Those parts of an organization that administrate, 
monitor, or control a problem domain. 
**Conditions:** The conditions under which the system will be developed 
and used. 
**Technology:** Both the technology used to develop the system and the 
technology on which the system will run. 
**Objects:** The main objects in the problem domain.
**Responsibility:** The system's overall responsibility in relation to its context. 
The FACTOR criterion can be used in two ways. You can use it to support system-definition developmen t, carefully considering how each of the six elements should be formulated. Or, you can start your definition by describing the system and then use the criteria to see how the system definition satisfies each of the six factors. In principle, either starting point works. <br>
As Figure 2.7 shows, formulating a system definition is a highly iterative process. For example, you might formulate the system definition, check it against the FACTOR criteria, and then reformulate it, continuing this process until the system definition is consistent with FACTOR. If you choose to structure the initial definition using FACTOR, you can then continue to iterate a textual definition. 
Using the system definitions above, we might compare the first with the FACTOR criteria as follows:

**System definition 1:**
**F:** Support for program design. AuLomate participant registration. 
**A:** Administration of speakers and participants. Control of conference 
papers. Program design. Participant registration. 
**C:** Volunteer labor has widely varying administrative experience. Development to proceed despite contradictory and missing requirements. 
**T:** Cheap PC platform with current tools. 
**O:** Speakers and participants. Conference papers and program. 
**R:** Administrative tool and communication meilium. 
You can formulate the individual elements in a system definition in different ways. For example, we can describe the administrative system's functionality in at least two ways: <br><br>
**Functionality 1:** Register information about participants and produce a complete participant list. <br>
**Functionality 2:** Register general participants as well as those with an 
active role such as author, speaker, or reviewer. Support the administration of finances and invitations. Support development of conference programs, including registration, paper acceptance, and session 
ilivisions. <br>
Functionality describes what a system should be able to do. Functionality 1 describes a smaller system that can only be used for registering conference 
participants. Functionality 2 describes a larger system with several major functions. 
The responsibility criterion describes how the system interacts with its 
tasks. In this, there is a broad spectrum of possibilities. A system can resemble a toolbox, for example, and offer many functions that users can apply in a flexible way. Or, a system can more or less automatically produce the results and impose a specific structure on the work process. The users' most important task is then to deliver input for system calculations. These 
two examples of responsibility can be expressed as follows: <br>
**Responsibility 1:** Support program design by producing overviews and allowing users to add comments and save different versions. Support 
confer ence operations by emphasizing potential problems at regular intervals. <br>
**Responsibility 2:** Automatic conference-planning program. Generate program from suggested sessions and incoming paper reviews. <br>
Small differences in how you formulate inilividual elements in a system 
definition can produce considerable system differences. Deliberate variation in the elements can, therefore, contribute to a systematic iliscussion of possibilities and choices. You can use the FACTOR criterion in developing and evaluating each definition. However, systematic evaluation of system definitions must never overtake the original goal, which is to get the customer and the users to answer the question: Is this the system you want? <br>
**Principles** 
The activities and techniques that are tied to pre-analysis can be summarized in three fundamental principles for system selection. <br>
**Appreciate the situation.** The customer's or users' understanding of the task is an important starting point. But you should also look behind 
their formulations and understand the situation in which the new system will be used. Rich pictures provide a quick overview of complex and ambiguous situations. They are a good basis for cliscussion 
and give us a way to express different interpretations of the same situation. <br>
**Cultivate new ideas.** Every development project is an opportunity to 
take a critical look at established traditions and think in new and different ways. Exemplars, metaphors, and exploratory experiments 
are cheap and effective techniques to bring new ideas into play. <br>
**Define alternative systems.** The customer and users are responsible for 
choosing the solution. System definitions are brief and concise descriptions of possible alternatives that can serve as a basis for their evaluation of possibilities and their choice of a satisfactory solution. 

## Lecture two
## Problem-Domain Analysis
Problem-domain analysis focuses on a key question: What information should the system deal with? The problem-domain model provides a language for expressing requirements to the system. During design, the model is transformed into a component that represents the problem domain's present state and previous history. 
Users employ a system to process, store, retrieve, and transfer information. They use the system to change the problem domain in order to accomplish their tasks. In doing so, they develop and use mental models. If we 
want to design usable systems, we must analyze and understand prospective users' mental models. This is emphasized in the first principle of this activity: 
**Principle:** *Model the real world as future users will see it.*
![Activities in problem-domain modeling](imgs/SAD/ActivitiesInProblemDomain.png)
The task, then, is to inquire into the problem domain and the users' understanding of it. In this process, you need not worry about existing systems, nor think about technical problems with storage and data transfer from other systems. Your focus should be on the future users' understanding of the problem domain. Once you have a good model, you can use it to design and implement a system that can process, communicate, and present information about the prolblem domain in an appropriate and usable manner. The aim of problem-domain analysis is to develop such a model. To this end, we employ an object-oriented focus on the key concepts that users apply to describe the phenomena they administrate, monitor, or control The description delineates the problem domain in more detail, and emphasizes 
both static and dynamic aspects. To create a useful model, we must consider the second principle: 
**Principle:** Get an overview first, then supply details.
As you model the problem domain, it is important to bring in as many possibilities, alternatives, and concrete circumstances as possible. However, you should test and evaluate all suggestions critically so that you include only the necessary elements. Your model should be at a reasonably high level of abstraction. The goal is to quickly build a model that briefly and precisely 
gives a r elevant overview. <br>
Problem-domain analysis is clivided into three activities, as Figure II.1 shows. First, you select the objects, classes, and events that will be the elements of the problem-domain model. Next, you build the model by focusing on structural relations between the selected classes and objects. This represents a movement from the object to the model level. Finally, you focus on the objects' dynamic properties, representing a movement back to the object level. 
In this way, our problem-domain analysis involves a movement from the parts to the whole and back to the parts again. This is the opposite of a top-down method, where you start with the whole and then continuously break it down into smaller and smaller fragments by describing parts and their properties.
The primary starting point for problem-domain analysis is a system definition. The "objects" element of the system definition provides the basic criterion for selecting objects, classes, and events. 

### Classes
![Purpose of this part](imgs/SAD/ClassesPurpose.png)
To model the problem domain, we start with the class activity and its fundamental question: Which objects and events should we include in the model and which should we leave out? <br>
This is figured out by studying the problem domain and talking with users to gain insight into how they understand it. Through this process, it is determined which phenomena are important in the concrete context of the project. The system definition helps us do this.<br>
Abstraction, classification, and selection are the primary tasks in the class activity. We abstract problem-domain phenomena by seeing them as objects and events. We then classify objects and events, and select which classes and events the system will maintain information on. Classes are the 
first means to define and limit a problem domain. We characterize each class by a specific set of events.
The class activity produces an event table (see Figure 3.1). The horizontal dimension contains the selected classes. The vertical dimension contains the selected events.
![Event table for a Hair Salon System](imgs/SAD/EvenTable.png)
#### Classification of Objects and Events

**Principle:** *Classify objects in the problem domain.*
During analysis, and especially in problem-domain modeling, the classification challenges become manifest. One challenge relates to tr aditions for using problem-domain concepts. We can, for example, be forced to further formalize existing concepts. An educational center might use the concept 
"course" to loosely describe several different things. When developing a system for education management, we must create more precise rules for what a course is-as opposed to, say, a seminar because we'll need to unambiguously couple these concepts to specific types of exams and resource-allocation rules. <br>
Another challenge is tied to how different users interpret shared concepts. In a manufacturing business, people in accounting, production, and sales do not necessarily understand an "order" concept in the same way, even though they use the same term. In some cases, we solve this problem by defining a single concept. In other cases, we must model the problem domain to permit different descriptions of the same phenomenon.<br> 
The aim in system development is to change the user organization by improving its products and services. Therefore, we should not just model the problem domain "as is." When developing an education management system, we should not simply model h ow the users plan and conduct exams. Instead, we should describe how the process will ideally be administered once the system is deployed. <br>
Creating good classifications is a challenge for all analysis methods. What distinguish the methods are their classification concepts and principles. In OOA&D, we use the concepts object and event to understand phenomena in the problem domain. What we see when we look at the problem domain are objects and events; not processes, entities, or anything else. 

##### Object
The object concept is the focus of the class activity. In Chapter 1, we defined this concept generally as: <br>

**Object:** *An entity with identity, state, and behavior.*

During problem-domain analysis, an object is an abstraction of a phenomenon in that problem domain. Figure 3.2 shows different examples of tangible objects in a problem domain: a customer, a clerk, and a contract. An object can, however, be less tangible, such as an organization or a resource. <br>
The key point is that we can identify and delimit the object as an independent entity. Figure 3.2 also illustrates an event: two partners agree on a contract. We can use such events to describe an important occurrence in the life of the involved objects. This way of using events is emphasized by the  following principle: 

**Principle:** *Characterize objects through their events.* 

**What is an object?**
We define an object as an entity with identity, state, and behavior. But what does this really mean in problem-domain analysis? 
**Entity** 
To call something an object, we must be able to describe it as an entity. With physically tangible objects, this is usually not a problem, but as objects become less tangible, they often become harder to define as clearly delineated entities. For example, it's easier to consider a person an entity than an organization
<br><br>

**Identity** An object's identity is the property that separates it from all other objects. By definition, all objects must have an identity, so we must define each object in a way that lets us distinguish it from all other objects in the problem domain. For example, in a sand pile, it is impossible to model individual grains of sand as objects because we cannot identify a particular grain as a separate entity from all the other grains. 
<br><br>

**State** 
An object's state consists of both its static properties and the dynamic or static values we assign to these properties. For example, static properties of a bank customer object are name, social security number, and the right to make transactions on certain accounts. For a specific customer object, these 
properties will have corresponding values that can be either static or dynamic. The customer's name can have the value "Jane Smith" and this value can change dynamically, even though we are still talking about the same customer. The customer's social security number, on the other hand, is a property that 
typically has a static value. Finally, we represent the customer's right to make transactions as connections between the customer object and the relevant account objects. This set of connections changes when the customer opens or closes an account. <br> <br> 
**Behavior** An object's behavior is the sequence of events that it actively performs and passively expenences during its lifetime. For example, a bank customer's behavior is the specific sequence of opening 
and closing accounts and making transactions that the customer has performed since entering the bank for the first time.<br>
##### Event
Events specify the qualities of problem-domain objects. We generally define an event as: 
**Event:** *An instantaneous incident involving one or more object*
An event is an abstraction of a problem-domain activity or process that is performed or experienced by one or more objects. When events are the main characteristics of objects, which events we introduce is critically important. For example, we might define a customer as an object that performs account transactions. In doing so, we characterize customer behavior iin a way that ignores the plethora of other events a customer might engage in, such as applying for loans or buying bonds. If we want to also manage these activities, we must introduce them as events that the customer can perform. 
![Figure 3.2: Classification of objects and events](imgs/SAD/ClassificationOfObjectsAndEvents.png)

#### Class
When, for example, we describe the bank's customers, we are not talking about individual customers and their individual activities; we abstract these further to arrive at the 
concept "customer." We use this concept to focus on the properties and behavior common to all bank customers. An individual customer's state and behavior are examples of how the abstract concept occurs in the problem domain. <br>
In the object-oriented approach, abstraction is directly supported by the class concept. The class concept refers to and describes all the objects in a specific class, as expressed in this definition: <br>

**Class:** *A description of a collection of objects sharing structure, behavioral patter, and attributes.*

When we perform the class activity, we are operating in an experimental mode. We start by identifying potentially r elevant candidates to include as classes and events in the problem-domain model. We then systematically evaluate them and select the classes and events that we actually consider 
to be relevant. This process is summarized in the following principle: <br>
**Principle:** *Have an open mind, but select critically.*
<br> 
Figure 3.3 shows the class activity's subactivities. We start by identifying objects, and, through abstraction and classification, develop a rich list of potentially relevant classes for our problem-domain model In a parallel activity, we identify and develop a similar list of events. We then systematically evaluate the many candidates and select the relatively few classes and events that we'll include in our problem-domain model. Finally, we relate events to classes as shown in Figure 3.1.
<br>

![Figure 3.3: Subactivities in selecting problem-domain classes and events](imgs/SAD/SubActivitiesClassesAndEvents.png)

<br>

### Find Classes
Class selection will define the first and most basic set of building blocks for your problem-domain model. To facilitate this selection process, it's important to write down all potentially relevant classes, without evaluating them in detail. The aim is to generate a candidate list that is as long and varied as possible. <br>
ou can use your own perception of the problem domain as a starting point. You can also use existing descriptions, including different rich pictures, the system definition, and, perhaps, an applicationdomain description. <br>
To get a good problem-domain description, you must collaborate with prospective users. You can do this in several ways, such as by interviewing them and observing them at work, as well as by holding workshops and discussions with the users about potential classes.<br>



**Candidates for classes**
To determine the problem domain's elements, you need a rich 
list of class candidates. To improve 
the selection process, consider both 
• nouns or noun phrases, and 
• general types. 
Focusing on nouns is natural in the object-oriented approach. An object will typically be described by a noun. You can also produce candidates by using the following checklist of general class types: 
• Physical things: car, goods, package, material. 
• People and roles: employee, parent, customer, member. 
• Organizations: company, department, group, project. 
• Places: shelf, parking spot, construction site, city. 
• Concepts: square, currency, quality parameters, fee, desire. 
• Descriptions: rule, item description, policy, product specification. 
• Resources: money, time, energy, labor force, information. 
• Devices: radar, sensor, valve, motor. 
• Systems: street register, cash register, alarm system. 

OOA&D, pages pages 385-392 (until the sub-section on Structure) is an example of development for a Hair salon.
## Lecture three
### Structure
In the class activity, we selected classes for our problem-domain model and characterized each class by its events. In the structure activity, we extend this description by adding structural relations between classes and objects. <br>
The result of the structure activity is a class diagram. The class diagram provides a coherent problem-domain overview by describing all structural relations between the classes and objects in our model. Figure 4.1 shows an example of a class diagram. <br><br>
![Figure 4.1: Class diagram for a Hair Salon System](imgs/SAD/ClassDiagramHairSalon.png)
<br><br>
All object-oriented structures are described on th e class level by certain connections among classes in a class diagram. As Figure 4.2 shows, the class diagram uses the graphical notation for a class. Figure 4.2(a) shows the notation for a class with a related collection of objects. Below, is also dealt with examples of classes that have no related objects; these are called abstract classes. These are included only for descriptive reasons, using italics to signify their name in notation, as Figure 4.2(b) shows. <br><br>

![Figure 4.2: Graphical notation of a class](imgs/SAD/GraphicalNotationOfClass.png)
<br><br>
Even though we describe class and object structures together in the class diagram, there is an important and decisive difference in their semantics. Class structures express static, conceptual relations between classes. They connect classes, and that relation does not change unless we change the description itself The object structures, on the other hand, express dynamic, concrete relations between objects. These relations can change dynamically without any implied changes in the description.

### 4.2 Structures between Classes
There are two types of class structures: generalization and cluster. Generalization structures gather the common properties and behavioral patterns of different classes into more general classes. Cluster structures collect several classes in a class diagram under one overall concept. <br>

#### Generalization Structure 
A generalization structure is a relation between two or more specialization classes and a more general class:<br> 
**Generalization:** A general class (the super class) describes properties common to a group of specialized classes (the subclasses).<br>
For example, the classes "Taxi" and "Private Car" might be specializations of the general class "Passenger Car," as Figure 4.4 shows. Similarly, the class "Vehicle" might be a further generalization of the classes "Passenger Car" and "Truck." <br><br>

We call a specialized class a subclass and a generalized class a super class. Linguistically, we express specialization with the formulation "is-a." You can use this to verify the correctness of a generalization candidate. We must, for example, be able to say that "a taxi is a passenger car." Figure 4.4 shows the graphical notation for a generalization structure. A generalization structure is drawn as an arrow from the subclass to the super class. If several arrows point to the same class, you can join the arrows as Figure 4.6 shows. The class diagram is easier to understand if all the arrows consistently point upwards, implying that generalization classes are above their specializations. <br><br>
![Figure 4.4: Generalization structure](imgs/SAD/GeneralizationStructure.png)
<br><br>
The set of objects in each of the specialized classes is a subset of the set of objects in the general class, and all subsets are mutually exclusive. This relationship can be expressed in another way: Everything that holds true for the general class also holds true for the specialized classes, whereas the properties of a specialization class may only hold true for that particular class. <br>
The generalization structure expresses inheritance: Specialized classes inherit the properties and behavioral pattern of the general class. Given this, the general properties apply to all objects at the specialized level, in addition to their own specialized properties. <br>

In some cases, we want to describe properties at an abstract level, even if the problem domain contains no objects at that level. Figure 4.5 shows an example in which the problem domain contains only employees and customers. Because the "Person" class contains no concrete objects, it is abstract, but it is useful for describing properties that are common to and inherited by both the employee and customer classes. <br><br>
![Application of an abstract super class ](imgs/SAD/AbstractSuperClass.png)
<br><br>
The typical generalization structure is hierarchical in that any subclass is a specialization of exactly one super class. However, multiple inheritance-in which a class inherits properties from two or more super classes can improve our model in some cases. Figure 4.6 shows an example, using a model with three types of accounts: basic account, checking account, and loan. In addition, there is a service account that inherits the properties and behavioral patterns from both the checking account and loan classes. <br><br>

![Figure 4.6: Different types of accounts with multiple inheritance](imgs/SAD/MultipleInheritance.png)
<br><br>

**Examples**
If our model contains customers and suppliers, we might make a "business partner" generalization class to contain common properties of the two original classes. <br>
Another approach is to take each of the selected classes and attempt to define a relevant generalization or specialization. For example, if our model contains employees, we can distinguish between different types of employees according to the type of work they do. We express this by introducing several new classes that are specializations of the employee class.

**Cluster Structure**
A cluster is a collection of classes that helps us achieve and provide a problem-domain overview:<br> 
**Cluster:** *A collection of related classes.* <br>
A cluster conveys an overall understanding of a problem domain by dividing it into smaller subdomains. The graphical notation is a file folder that encloses the classes. Figure 4. 7 shows an example of a model for an automobile register. As the figure shows, a cluster is usually named after a central class: the "Cars" cluster consists of all classes pertaining to types of cars and their components. Another cluster is composed of the classes describing people associated with the cars. These two clusters summarize the model's basic structure.<br><br>
![Figure 4.7: Cluster structure](imgs/SAD/ClusterStructure.png)
<br><br>
Classes within a cluster are usually connected by either a generalization structure or an aggregation structure. For example, this is the case with the "Cars" cluster in Figure 4. 7. Relations between classes from different clusters are usually association structures. In Figure 4.7, "Owner" and "Car" in two different clusters are related through an association structure. <br>

To increase a class diagram's clarity, we can explicitly group and name collections of classes. This organizes conceptually related classes into clusters. <br>
Figure 4.10 shows an example of a class diagram that gives a simple and overall description of a problem domain. 
<br><br>
![Figure 4.10: Clusters in the Hair Salon System](imgs/SAD/ClustersHairSalon.png)
<br><br>
Although you might be tempted to include a class in two different clusters, it is not allowed. If you can't determine membership, you should create 
a new cluster for the class in question. Clusters are expressions of subdomains within the problem domain; we can use them during analysis to enhance clarity. They also help us achieve clarity in the resulting model when other structures have been defined. You can use other structures as a starting point for generating cluster candidates. G<br>

### Structures between Objects 
There are two types of object structures: aggregation and association. Both structures capture dynamic relations between objects in the problem domain. We describe the object structures in the class diagram as structural relations between two or more classes. The structures are described on the class level, with an assigned multiplicity property specifying that some objects from the related classes can be connected.<br>
**Aggregation Structure**
An aggregation structure is a relation between two or more objects. It expresses that one object is a fundamental and defining part of the other:<br> 
**Aggregation:** *A superior object (the whole) consists of a number of inferior objects (the parts).*<br>
An aggregation structure is drawn as a line between the classes of the whole and the parts, where the line is annotated with a rhomb at the class that models the whole.<br> 
Figure 4.8 shows an example of an aggregation structure. In this model, objects of the "Cam Shaft" class can be part of an object of the "Engine" class, and an object of the "Car" class can aggregate an object of the "Engine" class. The opposite of aggregation is decomposition. In this figure, for example, a car can be decomposed into objects from the "Body," "Engine", and "Wheel" classes. <br>
As Figure 4.8 shows, we specify multiplicity with a single number or a range between two numbers. The numbers can be either absolute values or variables. You can read the multiplicity as follows: Every engine has between two (2) or more (*) cylinders, while every cylinder is part of precisely 
one (1) engine. The multiplicity is always read from the middle of the connection out toward the related objects.<br> 
Linguistically, we express aggregation with the formulation "has-a," such as, "a car has an engine." Similarly, we express decomposition as a "is-part-of" or "is-owned-by" relation, such as, "the engine is a part of the car."<br><br>
![Figure 4.8: Aggregation structure](imgs/SAD/AggregationStructure.png)<br><br>

There are three typical applications of aggregation structures: 
• Whole-Part, in which the whole is the sum of the parts; if we add or remove any part, we change the whole fundamentally. <br>
• Container-Content, in which the whole is a container for the parts; if we add or remove any content, we do not change the fundamental properties of the whole. <br>
• Union-Member, in which the whole is an organized union of members. We do not change the union fundamentally by adding or removing a few members. However, there is a lower limit on the number of members, as it is artificial to model a union without members. <br>
In an aggregation structure, the whole is considered to be superior to its parts. This is reflected in the class diagram through the vertical placement of the classes.<br><br>

**Association Structure**
An association structure is also a relation between two or more objects, but it differs from aggregation in that associated objects are not a defining property of an object: <br>
**Association:** *A meaningful relation between a number of objects.*
An association structure is drawn as a simple line between the relevant classes. We describe association multiplicity in the same way as we describe aggregation. Because the association structures do not imply ranking, you can place the related classes anywhere in the class diagram. <br>
Association is often used when aggregation would imply a too strong relation. For example, we may want to model a problem domain where a car 
is owned by one or more people, and a person owns zero or more cars (see Figure 4.9). It makes no sense to say that an object from the car or person classes contains objects from the other class as its parts. Moreover, the person who owns a car is neither a defining property of a car, nor the reverse. Therefore, the relation between objects from the two classes is described as an association structure and not as an aggregation structure. <br>
Linguistically, we can express association with the formulation "knows" or "associated-with." <br>
<br>

![Figure 4.9: Association structure](imgs/SAD/AssociationStructure.png)
<br><br>
It is not always clear which properties a given association structure represents. We solve this by explicitly naming the association structure. We 
might call an association structure between a person and a car "ownership," for example, to emphasize the relationship that the structure represents. 
Also, in a motor vehicle register, for example, two different associations between cars and people might be necessary: "owned by" and "used by."
<br>
To generate candidates for association structures, we look at the remaining class pairs to see if they can be meaningfully related. We should describe 
associations whenever we must administrate, monitor, or control relations between objects that are not otherwise related in the model.<br>

### Find Candidates for Structure
We model structural relations in much the same way as we select classes and events. We start by generating candidates for structural relations between the model's classes. This is based on the following principles:<br> 
**Principle:** *Study abstract, static relations between classes*<br>
**Principle:** *Study concrete, dynamic relations between objects.*<br>
Canidates are generate candidates based on the four types of structures we introduced above.

### Explore Patterns
you can apply patterns to solve specific problems during problem-domain modeling. A rich pattern collection is also useful as a catalog of ideas for modeling phenomena in a problem domain. Here is four patterns that are particularly concerned with structure.

**The Role Pattern**
We use the role pattern to model a situation in which a single person can have several different roles in the problem domain. The diagram on the left of Figure 4.11 shows an example of a company in which a person can be either an employee, a customer, or both. We model this by generalizing employees and customers into persons. A person then 
aggregates one or more roles, where each role is either employee or customer.<br> <br>
![Figure 4.11: The role pattern](imgs/SAD/RolePattern.png)
<br>
This structure lets a person change roles dynamically over time. For example, a person may start as a customer and later be hired as an employee. 
In this case, we would first establish a person object and assign a customer role, and later add an employee role. <br>
The right side of Figure 4.11 shows the general role pattern. A person object aggregates zero or more role objects, where each role object is from 
one of the classes Role 1, Role2, ... Role0 . Pr operties and behavior common to all the role classes are described in the abstract class "Role."<br> 
If the different role classes have nothing in common, we use a simplified pattern variation without a separate role class, as Figure 4.12 shows. <br><br>

![Figure 4.12: A simple variant of the role pattern ](imgs/SAD/SimpleRolePattern.png)
<br><br>

**The Relation Pattern**
A typical modeling problem is the desire to relate two objects to each other through a relation that carries its own properties. We can model this by assigning a name to the association, but the relation pattern is a better solution. <br>
The Figure 4.13 shows an example, in which we modeled the ownership relation between a car and its owner. The person aggregates a number of ownership objects and each of them relates to exactly one car. During its lifetime, a car might have several owners.<br><br>

![Figure 4.13: The relation pattern](imgs/SAD/RelationPattern.png) 


**The Hierarchy Pattern**
Many problem domains include objects that are organized into a hierarchy with two or more levels and relationships exist among objects on different levels. <br>
The left side of Figure 4.14 shows an example where all students are organized into classes, and all classes are organized into semesters. A student belongs to exactly one class and the class has many students. <br>
The right side of the figure shows the general version of the hierarchy pattern. When we use this pattern, we must decide what the elements are and how many levels of hierarchy to organize them in.<br><br>
![Figure 4.14: The hierarchy pattern](imgs/SAD/HierarchyPattern.png)
<br>
A useful variation on the hierarchy pattern is one in which objects at one level can belong to several objects on the level above. In this situation, the elements of the hierarchy are not mutually exclusive.

**The Item-Descriptor Pattern**
The left side of Figure 4.15 illustrates a solution to a classical domain-modeling problem: the distinction between items and their description. The example is taken from a library. Books have descriptions and keywords to facilitate search, and numbers to determine where they are located in the library. For each book, there is at least one copy. Each copy h as its own identity and is treated as a separate entity, but all copies share the properties described by the related book object. <br>
The right side of Figure 4.15 shows the general version of the item-descriptor pattern. An object from the overall class "Descriptor" defines specific properties shared by all the related objects from the "Item" class. <br><br>

![Figure 4.15: The item-descriptor pattern](imgs/SAD/ItemDescriptorPattern.png) 
<br>
The item-descriptor pattern is particularly useful in systems that administrate different kinds of descriptions, such as contracts, insurance policies, and product specifications. 

### Evaluate Systematically 
It is easy to generate many candidates for structural relations between classes. It is much more difficult to produce a simple and comprehensive problem-domain model. You must be prepared to reformulate and refine classes and structures several times before arriving at a satisfying solution. This involves systematic evaluation based on the following principle: <br>
**Principle:** *Model only the necessary structural relations.* <br> 
When we evaluate structural relations, we can benefit from the following criteria. 
• Structures must be used correctly. <br>
• Structures must be conceptually true. <br>
• Structures must be simple. <br>
A fundamental and classical error when modeling object-oriented structures is to mix generalization and aggregation. Both are potentially relevant abstractions, but it makes no sense to say that "an engine is a car," or that "a passenger car bas taxis and private cars."<br>
An aggregation structure is a special, stronger form of association and can thus always be expressed as an association structure. "Has-a" or "is-part-of" are good tests for aggregation candidates. <br>
the following three questions can assist you in differentiating between aggregation and association structures. 
• Can the objects exist independently of each other? <br>
• Are the objects equally ranked? <br>
• Can the connection from an object from the one class change to other objects from the other class? <br>
If you answer yes to at least two of the questions, consider an association structure. Otherwise, consider an aggregation structure. For example, looking at the structures in Figure 4.6, a car and its engine cannot exist independently over a long period, the car is superior to the engine, and we typically wouldn't move the engine to another car. Therefore we select an aggregation structure. A car and its owner can, on the other hand, exist independently of each other, they are equally ranked, and both car and owner can change their relation to other objects of the same class. Therefore, an association structure is most appropriate.<br>

## Lecture four
### Behavior
In the behavior activity, we extend our class definitions in the class diagram by adding descriptions of the behavioral pattern and attributes of each class. The result is expressed graphically in a statechart diagram, as illustrated in Figure 5.1<br>
![Figure 5.1: A simple statechart diagram for a class "Customer" in a bank](imgs/SAD/SimpleStatechart.png)
<br>

### Behavioral Pattern and Attributes

An object is an entity with identity, state, and behavior. In the class activity, we see behavior simply as the unordered set of events that involve an object. In the behavior activity, we describe behavior more precisely by adding the relative timing of events. An object's behavior is defined by an event 
trace that exhibits a certain ordering of events over time: <br><br>
 ***Event trace:*** A sequence of events inuoluing a specific object.
<br>
An event trace is unique for a specific object; it is the precise event sequence that the object is involved in during a time interval. For example, an object of the class "Customer" in the figure below might have the following event trace during its lifetime:
<br>
account opened - amount deposited - amount withdrawn - amount deposited - account closed
<br>
The focus in object-oriented problem-domain analysis is on objects, but for practical reasons, we describe groups of objects by common class definitions. Accordingly, we refrain from describing the behavior of every object in the problem domain. Instead, we describe a behavioral pattern for object classes: <br><br>

 ***Behavioral pattern:*** *A description of possible event traces for all objects in a class.*

The above figure defines such a behavioral pattern. It expresses that an object from the class "Customer" is created when the customer opens an account in the bank. The customer can then deposit and withdraw money. The customer object ends its life when the account is closed. <br> 
The behavioral pattern describes behavior common to all objects of the class. To produce the pattern, we use examples of event traces for individual objects in the class: <br><br> 

***Principle:*** *Create behavioral patterns from event traces.*<br>

When we model the problem domain, we formulate requirements for data that the system will store, and thereby render the data accessible through functions and interfaces. To specify the data, we use attributes: <br>
**Attribute:** *A descriptive property of a class or an event.*<br>
In object-oriented analysis, attribute specification is part of a class definition and is based on our understanding of object behavior. This is expressed in the following principle: <br>
**Principle:** *Derive class attributes from behavioral patterns.*<br>
We define attributes simply, using a name rather than detailed divisions into data fields and data-format specifications. For example, a person's name and address can be subdivided into first name and last name, as well as street, number, and town. In object-oriented analysis, such subdivisions are unnecessary as they simply extend the analysis document and add nothing substantial to our understanding of the problem domain.<br><br>

The behavior activity includes four subactivities. Our departure point is the event table and the class diagram. We start by describing a behavioral pattern for each class in the class diagram, using the related events as building blocks. We use general patterns of class behavior to improve our description and discover new ways of expressing dynamic aspects of the problem domain. Because these activities will unveil weaknesses and deficiencies in our choice of classes and structures, we also generate candidates for new classes and structures at this time. The activity ends with our specification of the main attributes for all classes and events.   

### Notation for Behavioral Patterns 
A behavioral pattern orders individual events in time using fundamental control structures from structured programming:<br>
*Sequence:* Events in a set occur one by one.<br>
*Selection:* Exactly one out of a set of events occurs.<br> 
*Iteration:* An event occurs zero or more times.<br>
<br>
The behavioral pattern is a description that captures the dynamic character of the problem domain without specifying how or why a certain behavior occurs. <br>
A behavioral pattern with sequence, selection, and iteration can be described most comprehensibly by a regular expression, a regular expression is a compact and precise notation, which you might know as 'regex'.  Given that "+" denotes sequence, "|" denotes selection, and "*" denotes iteration, the behavior of a customer can be described by the following regular expression:<br> <br>
account opened + (amount deposited I amount withdrawn)* + account closed <br><br>
This describes the possible course of each customer object's life, by defining, on a class level, the possible behavior of all the objects that belong to the class. It defines numerous event traces, each of which represents a potential object behavior. For example, all of the following event traces lie within the boundaries of the behavioral pattern defined by the regular expression above:<br> 
account opened - account closed <br>
account opened - amount deposited - amount withdrawn -amount deposited - account closed<br>
account opened - amount withdrawn - account closed <br><br>
The behavioral pattern also defines the event traces that are not legal. For example, it is impossible, within the limits of the behavioral pattern defined above, to make deposits or withdrawals before an account is opened or after an account is closed. The behavioral pattern thus describes both the legal and illegal event traces for objects in a specific class. <br>
You can also describe a behavioral pattern graphically with a statechart diagram. This classic notation is generally used to describe dynamics involving a finite number of states and a finite number of transitions between them. Transitions between states are representations of possible problem-domain events. A statechart diagram has the same expressive capability as a regular expression.<br><br>

As Figure 5.3 shows, the three classical control structures used in regular expressions can also be expressed in a statechart diagram. <br>
*Sequence* is expressed by making the events lead through several states, where each state has only one event leaving it. The events must occur in the order that the sequence specifies, indicated by the direction of the arrows. The sequence in Figure 5.3 indicates that the events from "a" to "z" occur one-by-one in the given order. The first and last events in the overall sequence are especially important. The first describes the event(s) that leads to the creation or birth of an object. Similarly, the last event(s) describes when a problem-domain object dies or disappears.<br> 
*Selection* is expressed by making all possible events lead out of the same state. The selection in Figure 5.3 means that exactly one of the events from "a" to "z" occurs exactly once.<br>
*Iteration* is expressed by making an event lead back to its original state. The first iteration in Figure 5.3 means that the event "a" occurs zero or more times. This form of iteration is direct as it leads right back to the original state. Figure 5.3 shows an example of indirect iteration: Event "b" leads to a state, and from that event "c" leads back to the original state. Therefor, an object's event trace includes an arbitrary number of repetitions of the sequence "b-c," indicating that the object toggles several times between two states.<br><br>
![Figure 5.3: Control structures in a statechart diagram](imgs/SAD/ControlStructuresStatechart.png) 

In special cases you may want to supplement with another form of transition-one that occurs when a stated condition becomes true. The behavior description of a rental-car reservation can, for example, look like the one shown in Figure 5.4. Here, an object is born when a reservation is registered at a customer's request. The customer must confirm the reservation. In addition, if the customer does not confirm the reservation before the deadline, the reservation is canceled and no rental can occur. This requirement is stated in the square brackets in the figure. This form of conditional transition is useful both with administrative and technical systems.<br><br>
![Figure 5.4: Example of a statechart diagram using conditions](imgs/SAD/StatechartDiagramUsingConditions.png)
<br>

### Describe Behavioral Patterns
When producing a behavioral pattern for a class, the point of departure is the set of events that involve objects. In the class activity, we captured the 
connection between classes and events in the event table. From this unordered set of events, we start identifying the first and last event in an object's life. We accomplish this by asking the following questions for objects from the class:<br> 
• Which events cause the creation of a problem-domain object? These events are grouped as selections that can cause the birth of an object.<br>
• Which events cause the disappearance of a problem-domain object? These events are grouped as selections that can cause the death of an object.<br><br>
**Sufficient, but Simple** <br>
When we make behavioral patterns, we have the following-sometimes conflicting-goals:<br> 
• The behavioral pattern should be sufficiently precise to describe all legal, and thus all illegal, event traces.<br> 
• The behavioral pattern should provide an overview and thus be as simple as possible.<br> 
#### Explore Patterns <br>
We focus on three basic behavior patterns. You can use them to improve an outline or contribute to a completely new idea for part of the problem-domain model.

**The Stepwise Relation Pattern**<br>
We use the stepwise relation pattern when certain problem-domain objects are related to the elements of a hierarchy in a stepwise or sequential manner. Figure 5.8 shows an example of this pattern. <br>
tepwise or sequential manner. Figure 5.8 shows an example of this pattern. The model describes a situation in which university students are first assigned to a semester, then to 
a class, and then to a group within the class. The group is an element of the relevant class, and the class is an element of the relevant semester. In this sense, it is a proper hierarchy. <br>
Figure 5.8 outlines the behavioral patterns. Student behavior, shown on the right, has a form wherein all events occur in a sequence. The events shown are those that are necessary to model when a student is assigned to an element in the hierarchy. <br>
At the bottom left of the figure is the relevant part of the behavioral pattern for the "Class" class. At some point, this element in the hierarchy is in a state where it accepts assignment of students to the class. There may be several occurrence of this event; each models the assignment of one student. <br><br>

![Figure 5.8: Example of the stepwise relation pattern ](imgs/SAD/StepwiseRelationPattern.png)
<br><br>

**The Stepwise Role Pattern**<br>
The stepwise role pattern describes interaction between several objects over time, but this pattern focuses on the horizontal dimension in a class diagram rather than the vertical dimension. You can use this pattern to describe how the behavior of a whole changes as its parts become active.<br>
Figure 5.9 shows an example of the pattern, where a sale is modeled as consisting of an offer, an order, and a delivery. The two statechart diagrams illustrate the behavior of the classes. The diagram to the right describes the behavioral pattern of the class "Sale." An object from this class is created when an offer is requested and terminates when the delivery is made. The other statechart diagram on the bottom left of the figure shows how the behavioral pattern of one of the parts will look. An offer is created when it is requested, and terminates when the offer is accepted or rejected. The two 
other parts will have similar behavioral patterns, and the last event in "Offer" will be the first in "Order," so an order is created when an offer is accepted. Similarly, a delivery is created when an order is received. <br>
A sale can be terminated at any time in the course of its life. We model this with a hierarchical state in which the event "sale cancelled" can terminate an object at any point in the subchart.<br>
The object that models the whole can start at later points in the sequence than we show in Figure 5.9. For example, a sale might be born directly as a delivery. To model this, we would include additional arrows from the initial state down to other states in the sequence. In Figure 5.9, the event "order received" might lead from the initial state to the "Awaiting" 
state.<br><br>

![Figure 5.9: Example of the stepwise role pattern](imgs/SAD/StepwiseRolePattern.png)
<br><br>

**The Composite Pattern**<br>
The composite pattern offers a way to describe the creation and destruction of a hierarchy using a detailed structw·e that is unknown at model-development time. An example of such a structure is the list of contents in a written document, a chart of financial-system accounts, or a list of pieces in a 
manufacturing process. <br>
Figure 5.10 shows an example of relevant structure and behavior for a manufacturing system: "part" is an abstract class; "simple part" and "composite part" are specializations. A composite part aggregates several parts, 
where each part is one of the two specializations.<br> 
Figure 5.10 also shows the behavioral patterns for the three classes. A part's statechart diagram imposes limits on specializations. A simple part's statechart diagram indicates that it is immediately ready, because it does not need assembly. It is then mounted in an enclosing composite. At this point, the simple part's separate life ends and it continues to live on only as an integrated part of a composite. The composite also has a terminating event, when this part with all of its subparts are mounted into a larger composite. <br>
The key point in this pattern is that the top-level behavior requires some behavior from the level beneath it, which in turn requires behavior from the level beneath it, and so on. We thus end up with a recursive description.
![Figure 5.10: Example of the composite pattern](imgs/SAD/CompositePattern.png)
Examples in OOA&D: chapter 19, pages 351-360
Examples in OOA&D, chapter 20, pages 394-396

## Lecture Five - Usage

![ApplicationDomainAnalysisPurpose](imgs/SAD/ApplicationDomainAnalysisPurpose.png)

Application-domain analysis focuses on a question: How will the target system be used? The purpose in asking it is to define requirements for the system's functions and interfaces. Application-domain analysis interacts with problem-domain analysis, which we discussed in Lecture Two. There, the question was: What is the target system about? The purpose of problem-domain analysis was to define requfrements for the system's model, which provides our vocabulary for defining the function and interface requirements. 
In most projects, deciding the order of these two main activities is a strategic question. If you begin by analyzing the application domain, your focus is on th e users' work, and you might specify many detailed requirements. From this, you can abstract the underlying concepts, which you can then model as classes, events, and structures in the problem-domain model. If you begin by analyzing the problem domain, your focus will be on what the business is really about, rather than on interfaces and functions.

To be usable, a system must fit the application domain. In this lecture we look at how we can determine this fit. We do this by describing actors and use cases based on an understanding of application-domain activities. The use cases provide an overview of the system requirements from the users' perspective and provide a foundation for defining and evaluating the more basic function and interface requirements.

Although starting with application-domain analysis is easier, starting with problem-domain analysis can yield a better object-oriented description. Many traditional methods and use-case-driven object-oriented methods recommend the first approach; some recommend that you let your situation determine whether to start your analysis with the application or problem domain. On some projects, you can even combine them, pursuing both activities in parallel.

Why distinguish between application and problem domains at all. Why not just model the target system straight away? The answer lies in the difference in stability of the target 
system's properties. As the following figure shows illustrates, a system's model is more stable; its functions and interfaces, more transient. When you change the model, you must change the functions and interfaces. However, you can change functions without changing the model (though you must change the interfaces) and you can change the interface, such as switching from text to graphics, without changing the functions or the model. In short, function and interface requirements change more often, while the system model 
rarely changes. Focusing on the different domains lets you design a more robust and flexible architecture.

![The relative stability of different system properties ](imgs/SAD/RelativeStability.png)

Requirements determination is based on two fundamental principles. 
The first principle is:
**Principle:** *Determine the application domain with use cases.*
Use cases offer an elegant solution to the classic problem in application-domain analysis: focusing on users' work yields too much information in too much detail. Use cases help concentrate the analysis on the interaction between users and the target system.

The second principle is: 
**Principle:** *Collaborate with users.*
Specifying requirements is not a one-way street. Users may not understand the technical options well enough to simply write down the optimal requirements. Cooperation between developers and users is needed. The requirements for usage, functions, and interfaces must be evaluated. You also need 
to reduce the uncertainty inherent in requirements definition. Because requirement formulations are abstract, it is difficult to know whether everything has been considered. To validate requirements, you should conduct experiments in cooperation with users.
Defining requirements is an iterative activity alternating between usage, 
functions, and interfaces. However, for pedagogical reasons, in requirements analysis we focus on each activity in turn, as the following figure shows.
![Application-domain analysis](imgs/SAD/AppDomainAnalysis.png)

The goal is to create a coherent and consistent result. The following figure gives an overview of the activities in application-domain analysis. 
In the next section, "Usage", we discuss how you can determine target-system use in the application domain by identifying and structuring actors and use cases. 
![Activities in application-domain analysis](imgs/SAD/AccAppDomainAnalysis.png)

## Usage

!["Usage" purpose](imgs/SAD/UsagePurpose.png)

### Use Cases

Analyzing an existing application domain can create a huge amount of detailed information that has little value to the development process. For efficiency, you must maintain a relevant level of abstraction and focus on the interaction between users and the system. Use cases can help you achieve a relevant focus and abstraction level. In this activity ti;he key concepts are:

**Actor:** *An abstraction of users or other systems that interact with the target system.* 
**Use case:** *A pattern for interaction between the system and actors in the application domain.*

Actors are an abstraction of people and other systems that activate a target system's functions. Of course, in a use-case description, we should indicate 
whether the actor is mechanical or human. A specific person or system can appear in different roJes. 
A use case is an abstraction of an interaction with the target system. It determines a delimited use of a part of the system. A use case can be initiated by an actor or by the target system. The complete set of use cases determines all uses of the target system within the application domain. The main principle in determining system usage is:

**Principle:** *Determine the application domain with use cases.*

Determining use cases is a multi-faceted activity. First, it demands cooperation between users and developers: users formulate needs and contribute 
application-domain insights, and developers formulate use cases and contribute technical knowledge.

Second, determining use cases is an analytical as well as a creative activity. Use cases originate from needs and conditions in the application domain, but a use case is itself an expression of a solution. 
Third, determining use cases is both a descriptive and experimental activity. You cannot fully evaluate the target system's use by sitting at a desk 
studying use cases. A truly critical evaluation must include the user. Some users can be both critical and constructive with a description of the use cases. However, in order to really involve the user, you must present use cases through prototypes. This is a central principle:
**Principle:** *Evaluate use cases in collaboration with users.*

Fourth, use cases define both the target system and its application domain. 
Changes to a company's computerized systems affect the company's organization and way of working. It is important to evaluate these changes in order to avoid negative side effects. (OOAD&D does not cover this) At a minimum, you should evaluate the target system's effect on the organizational context, as expressed in the following principle:
**Principle:** *Assess social changes in the application domain.*

![ApplicationDomainAnalysisPurpose](imgs/SAD/SubactivitiesOfUsage.png)
The above figure offers a summary of usage analysis activities: Actors and usecases are defined, often using patterns as inspiration. The activity results 
in a description of all use cases and actors. These descriptions should be systematically evaluated.

### 6.2 Example: An Automated Payment System

A basic automated payment system has four actors: account owners, who use the system for payment and cash withdrawals; creditors, who have customers that pay via the 
system; administrators, who work with the system; and lquidity monitors, who use the system to monitor the bank's liquidity.
An actor table, as shown in the figure below, provides an overview of the interaction. 
![An actor table](imgs/SAD/ActorTable.png)

The figure below shows the same information graphically in a use-case diagram. You can illustrate the relation between actors and use cases using either an actor table or a use-case diagram. Most prefer the actor table, as it consumes less space (it's probably less confusing too); UML recommends the use-case diagram.
![A use case diagram](imgs/SAD/UseCaseDiagram.png)

The account owner is involved in four use cases: payment, cash withdrawal, money transfer, and account information. Credit card payments always occur through the creditor-an interactive process involving both actors. Cash withdrawals occur at publicly accessible ATM machines, which are robust and easy to use. Transfers of money to the account can occur either electronically or by check. Although account information is sent by mail to the account owner on a monthly basis, the owner can also call the 
administrator to receive special account information.

The creditor participates in three use cases: payment, money transfer, and credit information. The payments should occur without trouble so that it does not distract the customer and delay the service. The system therefore offers different technical possibilities. The credit card can be read directly by a cash register. Alternatively, the cash register can be fitted with a removable, portable card reader with a keyboard. This card reader is especially used by creditors in places such as restaurants, where the payment does not necessarily occur at a cash register. Transferring money from the system to the creditor occurs electronically or by check. Credit information is given with variable speed and frequency. The creditor can therefore choose between an advanced cash register, which is directly linked to the system; indirect transfer of credit information in electronic form; or sending 
account balances through conventional mail.

Administrators participate in six use cases: registration, monitoring, error correction, money transfer, account information, and credit information. The account owner and the cr editor should be able to contact an administrator with all types of needs, and in principle, the inctividual administrator should perform all tasks related to the payment system. It is important that an administrator has a system overview and is able to switch quickly and efficiently between the system's different functions.

Liquidity monitors participate in only one use case: account information. A liquidity monitor compares information about all the accounts to see 
if the liquidity rules are being followed. A liquidity monitor activates the system to obtain information about the accounts in the payment system; in 
our example, the monitor is another computerized system with access to accounts.

The payment system illustrates the important differences and variations in actors and use cases. Account owners, creditors, administrators, 
and liquidity monitors all use the system in different ways and situations. 
The requirements as to what should be accessible and in what form this access should take place vary widely and must be thoroughly analyzed and 
defined. You may not notice great differences or variations in some systems, but they are there nonetheless. You must understand these differences to design a system that is well adapted to the technical and organizational context

#### Actors and Classes, Use Cases, and Events - A side note

An actor table looks similar to the event table discussed in Chapter 3. This raises the question: Is there any difference between actors with use cases and classes with events? The answer is yes. The main difference is that the phenomena occur in different domains.<br>
A class describes something that the target system should manage, such as a customer. An actor describes someone or something that interacts physically with the system, such as a clerk. An event describes an incident the system must be aware of, such as when a customer orders certain goods. A use case describes the interaction between an actor and the system, such as a clerk entering an order.<br>
An event is something we want the system to remember. A use case is a way of using the system, such as to enter information. The event can occur at a different time and place than the related use case. For example, the ordering could happen in a store and the related use case could be performed later on in a back office.<br><br>

Of course, there are similarities between actor tables and event tables. They both view their domains- the application domain and problem domain, respectively-in static and dynamic aspects. Actors and classes describe static aspects, while use cases and events describe dynamic aspects. Events are structured into behavioral patterns. Similarly, use cases can be viewed as another type of behavioral pattern, albeit in another domain.<br>
We can imagine cases in which the application domain and the problem domain overlap. If a customer enters an order over the Web, then "Customer" is both a class and an actor, and "ordering" is both a use case and the event that occurs when the order is accepted. Thus, the denotation of the concepts can overlap, but the descriptions of actors and classes, and use cases and events, will differ.<br>

#### Find Actors and Use Cases

The central questions about the target system's usage are: Who will use the system? How will it be used? You can answer these questions in terms of actors and uses cases.

#### Identify Actors

To identify actors, you must determine the division oflabor and the task-related roles in the target system's context. 
In the payment system, the four actors are easy to identify because their reasons for using the system are very different. The account owner, the creditor, and the administrator reflect three different organizational roles. 
It might be possible to further specialize these roles. For example, can the account owners be divided into different types? The answer depends on the business policy. In this case, a simple system is preferred. 
We separate the liquidity monitor from the administrator, because the liquidity monitor can be another system, whereas the administrator is always a person. 
The criterion for determining different actors is the dissimilarity of roles, as expressed by the use cases in which actors are involved. This corresponds to the criterion for having two different classes in the problem domain: their objects' behavioral patterns differ.

#### Describe Actors

We describe the target system's actors in actor specifications, as shown in the below figure. An actor specification consists of three parts: goal, characteristics, and examples. The goal describes-as precisely as possible-the actor's role in relation to the target system. The characteristics describe important aspects of actors' use of the system. When the actor is another system, the characteristics could include the technical interface. The general characteristics can be supplemented with concrete examples.
![Account Owner Specification](imgs/SAD/AccountOwnerSpec.png)

#### Describe Use Cases

The use cases are abstractions of the interactions between the system and the actors. Here, it is vital that you choose suitable abstractions. In the payment system's actor table and use-case diagrams, we named a total of eight use cases: payment, cash withdrawal, money transfer, registration, monitoring, error correction, account information, and credit information. Each of these use cases defines a limited interaction between one or more actors in the target system. We delimit a use case based on the specific actors' viewpoint and application-domain tasks. The goal is to collect the many possible ways of using the target system in a few well-chosen use cases. Taken together, your use cases should give an overview; individually they should be abstractions that are both logical and meaningful to the involved actors.
You can produce a list of possible use cases by examining the application domain's tasks. To determine whether or not the use cases are actually distinct, you must describe them in greater detail. Because use cases are dynamic phenomena, you can descibe them using statechart diagrams or text specifications.

You can produce a list of possible use cases by examining the application domain's tasks. To determine whether or not the use cases are actually distinct, you must describe them in greater detail. Because use cases are dynamic phenomena, you can desc1·ibe them using statechart diagrams or text specifications.

A statechart diagram defines the different states of the interaction and the different ways the system or actor can change that state. Figure 6.5 shows an example of a statechart diagram, and Figure 6.6 shows a specifibøcation of the same use case. In a use-case specification, the use case itself is briefly but precisely described in a structured text that focuses on the actors. As a supplement, you can also describe the relevant system objects and functions.

![Statechart diagram for cash withdrawl](imgs/SAD/StatechartCashWithdrawl.png)

You can describe a use case with either a statechart diagram, a usecase specification, or both. A statechart diagram provides a good overview of the dynamic process and the logic of a use case, but omits many details. A use-case specification conveys an overview of usage details, but makes it difficult to simply and sufficiently describe its logic. 
<br><br>
![Figure 6.6: Use-case specification for "cash withdrawals"](imgs/SAD/UseCaseSpecification.png)

In each use-case description, you should identify individual actors and interactions. You can postpone further detailing (such as how the interactions are precisely performed). The purpose of use cases is to provide an overview of the application domain's interaction with the system. The use 
cases should be sufficiently detailed to enable developers to identify all functional and interface elements and requirements. You can elaborate on how individual actions are actually performed when you design the detailed user interface.
<br><br>
Look at OOA&D, Chapter 19 (pages 362 - 364) for examples
<br><br>

## Lecture Six - Functions
<br><br>

Functions focus on what the system can do to assist actors in their work. When determining requirements for the functions, we ask the following question: What is the system going to do? In the usage activity, our question focused more on how the system would be used. Given that it is difficult to analyze "what" without analyzing "how," the usage and function activities are closely connected.
<br><br>

### System Functions
<br><br>
From an analytical point of view, the elegance of functions is that they express, in a simple way, the intent of a system. More precisely, we define a function as follows.
<br><br>

**Function:** *A facility for making a model useful for actors.*
<br><br>
A function is activated, executed, and provides a result. Function execution can change a model component's state or create a reaction in the application or problem domains. A function is a requirement; it is an abstract property of the system. Functions are realized through program operaions
<br><br>

### Function Types
<br>
As an aid to our analysis, we will discuss different types of functions. Each function type expresses a relation between the model and the system's context and has characteristics that help us when we define functions. We have identified four types of functions:
<br><br>

*Update* functions are activated by a problem-domain event and result in a change in the model's state.
<br><br>

*Signal* functions are activated by a change in the model's state and result in a reaction in the context; this reaction might be a display to the actors in the application domain, or a direct intervention in the problem domain.
<br><br>

*Read* functions are activated by a need for information in an actor's work task and result in the system displaying relevant parts of the model.
<br><br>

*Compute* functions are activated by a need for information in an actor's work task and consist of a computation involving information provided by the actor or the model; the result is a display of the computation's result.
<br><br>
A system's specific functions are rarely "pure"; they seldom fit perfectly into one of the four types. Functions are mixtures. The primary function in an air traffic control system will involve update, signal, read, and compute. 
However, it is still useful to categorize the functions. To do so increases our understanding of their
character, and lets us use the function types as tools in our application-domain analysis.
<br><br>
* An example of a signal is a function that continuously follows the traffic situation and gives an alarm in a critical situation.
<br><br>

### Analyzing Functions

The purpose of this activity is to determine the system's information processing capabilities by constructing a complete list of functions, as well as a detailed specification of the complex parts. Describing functions is not particularly difficult; the greater challenge is to choose which functions to include.
<br><br>

![Function Specification](imgs/SAD/Functions.png)
<br><br>
The central criterion for system-functionality analysis is that analysis ends with a list of functions that is both complete and consistent with the use cases. This is expressed in the following principle:
<br><br>

**Principle:** *Identify all functions.*
<br><br>
For some functions, you must describe their content in detail to understand what they do. However, you should give detailed descriptions for only the most complex and incomprehensible functions. The second principle for the function-analysis activity is:
<br><br>

**Principle:** *Specify only complex functions.*
<br><br>

![Events vs use case vs functions explained](imgs/SAD/EventVSUseCaseVsFunctions.png)
<br><br>

**Principle:** *Check consistency with use cases and the model*
<br>
Function analysis consists of three subactivities: find functions, specify complex functions, and evaluate critically. The relations between subactivities, preconditions, and results are shown in the first figure of this lecure.<br> <br>

### Find functions
<br>
When finding the functions, there are two essential aspects that you should keep in mind. First, consider the sources for identifying functions. Where do the system's function requirements come from? Second, consider the level of detail. How detailed should you be in function descriptions? How general or specific should you be in defining individual functions? The sources for identifying functions are partly the problem-domain description, as expressed by its classes and events, and partly the application-domain description, as expressed by its use cases. Classes typically give rise to read and update functions. Events lead to requirements for update functions. Use cases give rise to all types of functions.<br>
<br>
You must describe functions in enough detail to provide both an overview of the total functionality and a basis for agreement between users and developers. Given this, the level of detail required depends on the experience of the users and developers. Inexperienced developers and users require greater detail to ensure that they share an understanding of the functions.<br>
<br>
Functions specified at a very general level yield uncertainty. Functions specified at a very specific level render the analysis inefficient. For example, describing read and update functions for all attributes is too much detail. A function like "calculate pay for all employees," is, on the other hand, too general. "Calculate basic pay," "calculate health insurance," and "calculate tax," is typically an appropriate level of detail for users and developers familiar with the application and problem domains.<br>
<br>
A good way to start identifying functions is to systematically ask questions related to the four function types. Each of the four function types give rise to several questions that lead to the required functions. We will now examine the analytical questions for each of the function types.<br>
---------------------------------

**Questions for each event** 
---------------------------------
<br>

* **How is the event observed, and how is it registered? In which use cases does this happen?**
<br>

* **How should the use cases be supported by update functions?**
<br>

* **Which objects, attributes, and object structures are affected by the event, and what requirements does this impose on the update functions?**
<br>
---------------------------------
<br>
Update functions are connected to events. The fact that an event is included in the model expresses that it is sufficiently important to warrant registration in the system. Each event triggers a state update for model objects that are involved in the event.<br>
<br>
Read functions are related to information needs expressed in use cases, but they are also related to the model's content. The fact that a class with events, attributes, and structures has been defined often reflects a direct need for information in the application domain. The following figure shows the relevant questions for uncovering information needs.<br>
---------------------------------

**Questions about infomation needs**
---------------------------------
<br>
* Given the work of the actors, what do the actors need to know about the state of the model? What read functions does this give rise to? <br>
* Given the model, which objects and structures will the actors need information about? What read functions does this give 
rise to?<br>
<br>
---------------------------------
<br>
Compute functions are related to more complex information needs that cannot be immediately met by reading the model. Compute functions must be identified from the use cases. An important question is how to delimit the individual compute function. Again, the use cases hold the answer. A computational sequence that cannot be interrupted by the actor should be supported by one function. If the computational sequence consists of several alternative parts, you must consider using more than one function. On the other hand, you should avoid cluttering the list of functions with insignificant variations in the computations of a basic function. The following figure shows the questions for analyzing compute functions. <br>
---------------------------------

**Questions about needs for computation**
---------------------------------
<br>
* Which computations (not necessarily based on the model) do 
the actors need to have carried out? <br>
* Does the computational basis come from the actors, the 
model, or both? <br>
* Which computations form complete wholes in the use cases?
<br>
---------------------------------
<br>
The result of the function-analysis activity is a list of functional requirements for the system. The list must be complete and express the collective needs of customers and actors and meet the application-domain's demands for computer support. The following figure shows an example of a list of functions for the Hair Salon System. At the top is the total functionality as described in the system definition; we then list the name, complexity, and type of each individual function. <br>
Complexity is an assessment of how complicated it will be to develop the function. In this case, we used a simple four-point scale with the values simple, medium, complex, and very complex. Assessing function complexity is a part of customer negotiations and offers an estimate of the development effort ahead. You can also use these assessments later, during development, as a basis for negotiations about changes to system requirements.<br><br>

![Function complexity planning](imgs/SAD/FunctionComplexity.png)
<br><br>

### Specify Complex Functions
<br>
The basic rule is that you should describe functions briefly and informally in a list. Detailed specifications are for special cases. You can construct a detailed specifications in several ways.
<br><br>
* A mathematical expression where the relation between input data and output data is specified as o = f(i) 
* An algorithm, which is typically sketched in a simple structured language with a few, simple control structures (also called pseudo code). 
<br><br>
* A further functional partitioning of a function in the function list, showing the complete functional hierarchy directly in the list, as the following figure shows. A hierarchical function list often gives a better overview than an equivalent data-flow description.
<br><br>

![Function complexity planning](imgs/SAD/FunctionComplexityPartition.png)
<br><br>
No matter what form you choose, it is recommended that you specify functions as briefly as possible during the analysis. The primary purpose is to identify the function.<br><br>

### Evaluate Systematically

In principle, there are three ways to ensure that your function list is complete. First, the users can review the list and agree that it shows exactly the functions they want. You can further support this by experiments with the users and function prototypes, or by comparing the functions and use cases.
<br><br>
Second, for each function type, you can ensure the possibilities are exhausted by returning to the questions in Section 7 .2, and using them to review your function list.
<br><br>
Third, you can compare the function list with the system definition and the model.
<br><br>
The general definition of the system functionality in the system definition should be in accordance with your final list of functions. If the system definition says it is a payroll system, then no invoicing functions should be included. Differences between the general definition and the list of functions may give rise to a revision of both the system definition and the functions. <br>
Finally, you must compare the function list with the model. The model must include precisely that information about the objects that the functions need; no more, no less. That is, if the model contains objects, structures, or events that are never used by any of the functions, then either the model contains too much or some functions are missing.


## Lecture Seven -
OOA&D, Chapter 15

Other things to read (background), (find them on the source indicated):
Lauesen, S. and Vinter, O. (2001) Preventing Requirement Defects: An Experiment in Process Improvement. Requirements Eng. 6:37–50.
https://link-springer-com.zorac.aub.aau.dk/article/10.1007/PL00010355

Dahlbom, B. and Mathiassen, L. (1993) Computers in Context: The Philosophy and Practice of Systems Design, Chapter 4 and 5. Blackwell Publishers.
Can be borrowed through the library (AUB)

 Wirth, N. (1971) Program Development by Stepwise Refinement. Communications of the ACM 14(4):221-227.
https://dl-acm-org.zorac.aub.aau.dk/ft_gateway.cfm?id=362577&ftid=43866&dwn=1&#URLTOKEN#

Naur, P. (1972) An experiment on program development. BIT 12:347-365.
https://link-springer-com.zorac.aub.aau.dk/content/pdf/10.1007%2FBF01932307.pdf

Mathiassen, L. and Stage, J. (1992) The Principle of Limited Reduction in Software Design. Information Technology & People 6(2-3):171-185.
https://www-emeraldinsight-com.zorac.aub.aau.dk/doi/pdfplus/10.1108/EUM0000000003550

## Lecture Eight - Architectural Design, Criteria and Components
<br>
A vague and unclear architecture will result in a lot of wasted work. Architectural design is often considered an all or nothing question. Either you build the system from scratch, in which case all the architectural issues must be addressed; or you adapt the system to an existing architecture, in which case many arch itectural decisions have already been made. 
The former situation is unusual; systems are rarely constructed from scratch. But, even if you are adapting the system to an existing architecture, you should be acquainted with the conditions that the architecture defines for the design activity. Even when much is already given, a surprising number of aspects must still be understood, studied, and thoroughly designed.<br><br>

Computerized systems are complex and multi-faceted: Are we talking about a system description, or are we dealing with its execution? Are we operating at an abstract level, or are we thinking about the physical devices and processes? Are we focusing on stable aspects, or are we emphasizing processes and dynamics? We must handle this complexity during design. Here, we offer two different and partially overlapping viewpoints. When combined, they provide a good understanding of architectural design<br><br>

The following figure illustrates the architecture concepts. The component architecture focuses on classes (the stable aspects). It structures the system in related components, and is concerned mainly with logical considerations. 
The component architecture decomposes the system into identifiable, mutually related components. The process architecture focuses on objects (the dynamic aspects).
![Component architecture and process architecture](imgs/SAD/ComArchitectureProcArchitecture.png)
<br><br>

### Criteria
#### Good design
A design is not only judged by its positive traits. If the 
design contains even one crucial flaw, it can be unusable in practice. Quality is essentially the absence of flaws, as expressed in the following principle: <br>

**Principle:** *A good design has no major weaknesses.*
<br><br>

#### Prioritize
<br>
You can assign priorities to the classical software-quality criteria, and add criteria that reflect your specific design conditions. The table in Figure 9.4 can serve as a checklist in this process.<br><br>

![Figure 9.4: Checklist for prioritizing design criteria](imgs/SAD/ChecklistPrioritizingDesignCriteria.png)

<br><br>

#### Principles
The following principles summarize our main points.<br> 
*A good design has no major weaknesses.* A single flaw can be enough to invalidate a design. A good design thus strives to achieve good properties and, at the same time, avoid bad ones.
<br> 

*A good design balances several criteria.* A good design must meet several criteria. Because these criteria can be conflicting, prioritizing all criteria is essential. 
<br>

*A good design is usable, flexible, and comprehensible.* The system's usability is determined by tensions between the system's technical qualities and its applicability to the users' work. Flexibility and comprehensibility help ease design and implementation work. 

### Components
#### System Components 
The component architecture defines the overall system structure, as summarized in the following definition. <br>
**Component architecture:** *A system structure composed of interconnected components.* <br>
In our method, we call the program parts that structure the classes a "component." We define a component in this way.<br> 
**Component:** *A collection of program parts that constitutes a whole and has well-defined responsibilities.*<br><br>

As this definition states, to design the component architecture we work with descriptions in the form of coherent program parts rather than program executions. On an object-oriented platform, most of these program parts will be classes. Our definition also emphasizes that any component 
must have clear and well-defined responsibilities. 
<br><br>
In Figure 10.1, for example, we have the component "User interface," which is responsible for reading the buttons and updating displays that let users interact with the system. The component "Functions" is responsible for providing system functionality. Functionality is provided to "User interface" as a set of operations on public classes in "Functions," hence the dependency in the diagram. <br><br>

![Figure 10.1: Class diagram with component architecture for a simple system](imgs/SAD/ClassDiagramComponentArchitecture.png)
<br><br>
The main purpose of the component architecture is that it be both comprehensive and flexible. Complex systems make stronger demands on these criteria, and thus the following principle.<br><br>

**Principle:** *Reduce complexity by separating concerns. In essence, then, separate components should address separate concerns.* 
Separating the concerns into different components adds to the comprehensibility. lt also increases system flexibility, particularly when the context's stability is taken into account. <br><br>
#### The Layered Architecture Pattern
An example is ISO's Open Systems Intercommunication model for networks. The OSI standard describes seven network layers, from the lowest (where electrical signals are physically exchanged) to the highest (where users apply software to exploit network facilities). In OSI, each layer has a well-defined purpose and a clear interface with the layers above and below it. <br><br>

![Figure 10.3: Layered architecture pattern](imgs/SAD/LayeredArchitecturePattern.png)
<br><br>
In the simplest form, a layered architecture consists of several components, designated as layers. The design of each component describes its responsibilities as well as its upward and downward interfaces. The downward interface describes which operations the component can access in the layer below. The upward interface describes the operations it makes available to the layer above.<br>
Figure 10.3 illustrates this pattern: The layers are described as components, and the dashed arrows show dependencies. In general, a dependency implies that a change in one component (pointed at) may affect the other component (pointed from). The typical dependency is that a layer uses the layer below. In UML the stereotype <<\usage>> denotes this, but in most 
cases it is implicitly assumed. <br><br>

#### The Generic Architecture Pattern
You can use the layered architecture to elaborate basic systems that include interface, function, and model components. The model component, containing the model of the problem domain, can be the lowest layer, followed by a system functions layer and, on top, the interface component. You can often decompose the interface layer into two separate parts: user interface and system interface. Figure 10.5 shows this simple and basic architecture.<br><br>

![Figure 10.5: The generic architecture pattern for a system](imgs/SAD/GenericArchitecturePattern.png)
 
<br><br>

#### The Client-Server Architecture Pattern 
The client-server architecture was originally developed to handle the distribution of a system among several geographically dispersed processors. The components in a client-server architecture are a server and several 
clients. The essential point is that there are many clients that use the server independently of one another, and they are not neccessarily part of any common whole, as Figure 10.6 shows.<br><br>

![Figure 10.6: The client-server architecture pattern](imgs/SAD/ClientServerArchitecturePattern.png)
<br><br>

### Define Subsystems 
<br>
Large systems must be divided into several independent subsystems that communicate with each other. Although each subsystem is part of the total system, you can also view it as an independent system with its own model, functions, and interfaces. In other words, when you decompose a system into subsystems, you're actually distributing the total model, functionality, and interface among several smaller systems. Figure 10.7 shows the general architecture of subsystems; in Chapter 22, there is a concrete example of a decomposed Cruise Control System. <br><br>
![Figure 10.7: The general architecture of subsystems](imgs/SAD/GeneralArchitectureOfSubsystems.png)
<br><br>

### Identify Components 
<br>
In system or subsystem design, we usually start with the layered architecture pattern using interface, function, and model components. We then extend this basic architecture with various decompositions by looking at the three primary concerns-the model, functions, and interface-together. Next, we look at components to encapsulate the technical platform, and see if it's possible to do this using existing components.<br>

**Model**<br>
A model component's main responsibility is to hold the objects that represent the problem domain. Whenever something relevant happens in the problem domain, the model-component objects should change state accordingly. If there are clear demarcations in the problem domain and the various segments appear incohesive, you may want to decompose the model component into parts.
<br><br>

**Function** <br>
The main responsibility of a function component is to provide the model's functionality. You can decompose the function component if it is incohesive or if the system has complex functionality needs. If there is a clear demarcation between parts of functionality, you can design this into the architecture as parts in a function component. 
<br><br>

**Interface** <br>
The main responsibility of an interface component is to handle the interaction between the actors and the functionality. Although stand-alone systems have only a user-interface component and embedded systems have only a system interface, most systems have both. Again, if usage is incohesive or complex (whether because of users or other systems) you should consider decomposing the interface components into parts.
<br><br>

### Principles <br>
**Reduce complexity by separating concerns.** The component architecture should be comprehensible. Using architectural patterns makes the architecture easier to understand. Reducing complexity also eases understanding; this is achieved by separating concerns into different components. <br>

**Reflect stable context structures.** The component architecture must be useful and valid in the future. To achieve this, the architecture should reflect stable aspects of the problem and application domains. 
At the same time, the component architecture should be flexible toward a context's unstable aspects.

**Reuse existing components.** Using components developed for reuse or for earlier versions of the system, or components bought off-the-shelf from a competent vendor, is an effective way to reduce the programming effort. Such components come in various forms; the right ones let you integrate previous experience and good solutions into your architecture. This contributes to a better design and less programming work
<br>