# Systems Development/System Analysis and Design

## Lecture one

### FACTOR

The factor criterion consists of six elements: <br>
Functionality: The system functions that support the application-do-main tasks.<br><br>
Application domain: Those parts of an organization that administrate, monitor, or control a problem domain. <br><br>
Conditions: The conditions under which the system will be developed and used. <br><br>
Technology: Both the technology used to develop the system and the technology on which the system will run.<br><br>
Objects: The main onbjets in the problem domain. <br><br>
Responsibility: The system's overall responsibility in relation to its context.

The FACTOR criterion can be used in two ways. You can use it to support system-definition development, carefully considering how each of the six elements should be formulated.  Or you can start your definition by describing the system and then use the criteria to see how the system definition satisfies each of the six factors. "In principle either starting point works"

## Lecture two

## Lecture three

## Lecture four

### Behavioral Pattern and Attributes

An object is an entity with identity, state, and behavior. In the class activity, we see behavior simply as the unordered set of events that involve an object. In the behavior activity, we describe behavior more precisely by adding the relative timing of events. An object's behavior is defined by an event 
trace that exhibits a certain ordering of events over time: <br><br>
 ***Event trace:*** A sequence of events inuoluing a specific object.

An event trace is unique for a specific object; it is the precise event sequence 
that the object is involved in during a time interval. For example, an object 
of the class "Customer" in the figure below might have the following event trace 
during its lifetime:

account opened - amount deposited - amount withdrawn -
amount deposited - account closed

![EventTraceforCustomer](imgs/SAD/EventTraceCustomer.png)

The focus in object-oriented problem-domain analysis is on objects, but for practical reasons, we describe groups of objects by common class definitions. Accordingly, we refrain from describing the behavior of every object in the problem domain. Instead, we describe a behavioral pattern for object classes: <br><br>
 ***Behavioral pattern:*** A description of possible event traces for all objects in a class.

The above figure defines such a behavioral pattern. It expresses that an object from the class "Customer" is created when the customer opens an account in the bank. The customer can then deposit and withdraw money. The customer object ends its life when the account is closed. <br> 
The behavioral pattern describes behavior common to all objects of the class. To produce the pattern, we use examples of event traces for individual objects in the class: <br><br> 
***Principle:*** Create behavioral patterns from event traces.

### Behaviour activities

###

### Event traces

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


### Usage
!["Usage" purpose](imgs/SAD/UsagePurpose.png)

#### Use Cases
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

#### 6.2 Example: An Automated Payment System 
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
An actor table looks similar to the event table discussed in Chapter 3. This raises the question: Is there any difference between actors with use cases and classes with events? The answer is yes. The main difference is that the phenomena occur in different domains.
A class describes something that the target system should manage, such as a customer. An actor describes someone or something that interacts physically with the system, such as a clerk. An event describes an incident the system must be aware of, such as when a customer orders certain goods. A use case describes the interaction between an actor and the system, such as a clerk entering an order.
An event is something we want the system to remember. A use case is a way of using the system, such as to enter information. The event can occur at a different time and place than the related use case. For example, the ordering could happen in a store and the related use case could be performed later on in a back office.

Of course, there are similarities between actor tables and event tables. They both view their domains- the application domain 
and problem domain, respectively-in static and dynamic aspects. Actors and classes describe static aspects, while use cases and events describe dynamic aspects. Events are structured into behavioral patterns. Similarly, use cases can be viewed as another type of behavioral pattern, albeit in another domain.
We can imagine cases in which the application domain and the problem domain overlap. If a customer enters an order over the Web, then "Customer" is both a class and an actor, and "ordering" is both a use case and the event that occurs when the order is accepted. Thus, the denotation of the concepts can overlap, but the descriptions of actors and classes, and use cases and events, will differ.

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

## Lecture Six - Functions

Functions focus on what the system can do to assist actors in their work. When determining requirements for the functions, we ask the following question: What is the system going to do? In the usage activity, our question focused more on how the system would be used. Given that it is difficult to analyze "what" without analyzing "how," the usage and function activities are closely connected.

### System Functions

From an analytical point of view, the elegance of functions is that they express, in a simple way, the intent of a system. More precisely, we define a function as follows.

**Function:** *A facility for making a model useful for actors.*

A function is activated, executed, and provides a result. Function execution can change a model component's state or create a reaction in the application or problem domains. A function is a requirement; it is an abstract property of the system. Functions are realized through program operaions

### Function Types

As an aid to our analysis, we will discuss different types of functions. Each function type expresses a relation between the model and the system's context and has characteristics that help us when we define functions. We have identified four types of functions:

*Update* functions are activated by a problem-domain event and result in a change in the model's state.

*Signal* functions are activated by a change in the model's state and result in a reaction in the context; this reaction might be a display to the actors in the application domain, or a direct intervention in the problem domain.

*Read* functions are activated by a need for information in an actor's work task and result in the system displaying relevant parts of the model.

*Compute* functions are activated by a need for information in an actor's work task and consist of a computation involving information provided by the actor or the model; the result is a display of the computation's result.

A system's specific functions are rarely "pure"; they seldom fit perfectly into one of the four types. Functions are mixtures. The primary function in an air traffic control system will involve update, signal, read, and compute. 
However, it is still useful to categorize the functions. To do so increases our understanding of their
character, and lets us use the function types as tools in our application-domain analysis.

* An example of a signal is a function that continuously follows the traffic situation and gives an alarm in a critical situation.

### Analyzing Functions

The purpose of this activity is to determine the system's information processing capabilities by constructing a complete list of functions, as well as a detailed specification of the complex parts. Describing functions is not particularly difficult; the greater challenge is to choose which functions to include.

![Function Specification](imgs/SAD/Functions.png)

The central criterion for system-functionality analysis is that analysis ends with a list of functions that is both complete and consistent with the use cases. This is expressed in the following principle:

**Principle:** *Identify all functions.*

For some functions, you must describe their content in detail to understand what they do. However, you should give detailed descriptions for only the most complex and incomprehensible functions. The second principle for the function-analysis activity is:

**Principle:** *Specify only complex functions.*

![Events vs use case vs functions explained](imgs/SAD/EventVSUseCaseVsFunctions.png)

**Principle:** *Check consistency with use cases and the model*

Function analysis consists of three subactivities: find functions, specify 
complex functions, and evaluate critically. The relations between subactivities, preconditions, and results are shown in the first figure of this lecure.

### Find functions

When finding the functions, there are two essential aspects that you should keep in mind. First, consider the sources for identifying functions. Where do the system's function requirements come from? Second, consider the level of detail. How detailed should you be in function descriptions? How general or specific should you be in defining individual functions? The sources for identifying functions are partly the problem-domain description, as expressed by its classes and events, and partly the application-domain description, as expressed by its use cases. Classes typically give rise to read and update functions. Events lead to requirements for update functions. Use cases give rise to all types of functions.

You must describe functions in enough detail to provide both an overview of the total functionality and a basis for agreement between users and developers. Given this, the level of detail required depends on the experience of the users and developers. Inexperienced developers and users require greater detail to ensure that they share an understanding of the functions.

Functions specified at a very general level yield uncertainty. Functions specified at a very specific level render the analysis inefficient. For example, describing read and update functions for all attributes is too much detail. A function like "calculate pay for all employees," is, on the other hand, too general. "Calculate basic pay," "calculate health insurance," and "calculate tax," is typically an appropriate level of detail for users and developers familiar with the application and problem domains.

A good way to start identifying functions is to systematically ask questions related to the four function types. Each of the four function types give rise to several questions that lead to the required functions. We will now examine the analytical questions for each of the function types.
---------------------------------

**Questions for each event** 
---------------------------------

* **How is the event observed, and how is it registered? In which 
use cases does this happen?**

* **How should the use cases be supported by update functions?**
 
* **Which objects, attributes, and object structures are affected 
by the event, and what requirements does this impose on the 
update functions?**

---------------------------------

Update functions are connected to events. The fact that an event is included in the model expresses that it is sufficiently important to warrant registration in the system. Each event triggers a state update for model objects that are involved in the event.

Read functions are related to information needs expressed in use cases, but they are also related to the model's content. The fact that a class with events, attributes, and structures has been defined often reflects a direct need for information in the application domain. The following figure shows the relevant questions for uncovering information needs
---------------------------------

**Questions about infomation needs**
---------------------------------

* Given the work of the actors, what do the actors need to know 
about the st.ate of the model? What read functions does this 
give rise to? 
* Given the model, which objects and structures will the actors 
need information about? What read functions does this give 
rise to?

---------------------------------

Compute functions are related to more complex information needs that cannot be immediately met by reading the model. Compute functions must be identified from the use cases. An important question is how to delimit the individual compute function. Again, the use cases hold the answer. A computational sequence that cannot be interrupted by the actor should be 
supported by one function. If the computational sequence consists of several alternative parts, you must consider using more than one function. On the other hand, you should avoid cluttering the list of functions with insignificant variations in the computations of a basic function. The following figure shows the questions for analyzing compute functions. 
---------------------------------

**Questions about needs for computation**
---------------------------------

* Which computations (not necessarily based on the model) do 
the actors need to have carried out? 
* Does the computational basis come from the actors, the 
model, or both? 
* Which computations form complete wholes in the use cases?

---------------------------------

The result of the function-analysis activity is a list of functional requirements for the system. The list must be complete and express the collective needs of customers and actors and meet the application-domain's demands for computer support. The following figure shows an example of a list of functions for the Hair Salon System. At the top is the total functionality as described in the system definition; we then list the name, complexity, and type of each individual function. 
Complexity is an assessment of how complicated it will be to develop the function. In this case, we used a simple four-point scale with the values simple, medium, complex, and very complex. Assessing function complexity is a part of customer negotiations and offers an estimate of the development effort ahead. You can also use these assessments later, during development, as a basis for negotiations about changes to system requirements.
![Function complexity planning](imgs/SAD/FunctionComplexity.png)

### Specify Complex Functions

The basic rule is that you should describe functions briefly and informally in a list. Detailed specifications are for special cases. You can construct a detailed specifications in several ways.

* A mathematical expression where the relation between input data and output data is specified as o = f(i) 
* An algorithm, which is typically sketched in a simple structured language with a few, simple control structures (also called pseudo code). 

* A further functional partitioning of a function in the function list, showing the complete functional hierarchy directly in the list, as the following figure shows. A hierarchical function list often gives a better overview than an equivalent data-flow description.
![Function complexity planning](imgs/SAD/FunctionComplexityPartition.png)

No matter what form you choose, it is recommended that you specify functions 
as briefly as possible during the analysis. The primary purpose is to identify the function

### Evaluate Systematically

In principle, there are three ways to ensure that your function list is complete. First, the users can review the list and agree that it shows exactly the functions they want. You can further support this by experiments with the users and function prototypes, or by comparing the functions and use cases.

Second, for each function type, you can ensure the possibilities are exhausted by returning to the questions in Section 7 .2, and using them to review your function list.

Third, you can compare the function list with the system definition and the model.

The general definition of the system functionality in the system definition should be in accordance with your final list of functions. If the system definition says it is a payroll system, then no invoicing functions should be included. Differences between the general definition and the list of functions may give rise to a revision of both the system definition and the functions. 
Finally, you must compare the function list with the model. The model must include precisely that information about the objects that the functions need; no more, no less. That is, if the model contains objects, structures, or events that are never used by any of the functions, then either the model contains too much or some functions are missing.

## Lecture Seven -

## Lecture Eight - Architectural Design, Criteria and Components

![Architectural Design purpose](imgs/SAD/PurposeIV.png)

A vague and unclear architecture 
will result in a lot of wasted work. Architectural design is often considered an all or nothing question. Either you build the system from scratch, in which case all the architectural issues must be addressed; or you adapt the system to an existing archltecture, in which case many arch itectural decisions have already been made. 
The former situation is unusual; systems are rarely constructed from scratch. But, even if you are adapting the system to an existing architecture, you should be acquainted with the conditions that the architecture defines for the design activity. Even when much is already given, a surprising number of aspects must still be understood, studied, and thoroughly designed

Computerized systems are complex and multi-faceted: Are we talking about a system description, or are we dealing with its execution? Are we operating at an abstract level, or are we thinking about the physical devices and processes? Are we focusing on stable aspects, or are we emphasizing processes and dynamics? We must handle this complexity during design. Here, we offer two different and partially overlapping viewpoints. When combined, they provide a good understanding of architectural design

The following figure illustrates the architecture concepts. The component architecture focuses on classes (the stable aspects). It structures the system in related components, and is concerned mainly with logical considerations. 
The component architecture decomposes the system into identifiable, mutually related components. The process architecture focuses on objects (the dynamic aspects).
![Component architecture and process architecture](imgs/SAD/ComArchitectureProcArchitecture.png)