| JPA                        | Hibernate               | Spring Data JPA                            |
| -------------------------- | ----------------------- | ------------------------------------------ |
| Java Persistence API       | ORM Framework           | Spring module built on JPA                 |
| It is only a specification | Implementation of JPA   | Simplifies database access                 |
| Cannot work alone          | Can work independently  | Requires JPA implementation like Hibernate |
| Defines interfaces         | Provides implementation | Provides repositories and CRUD methods     |
| Portable                   | Vendor specific         | Reduces boilerplate code                   |


Relationship
------------

Spring Data JPA
        ↓
        JPA
        ↓
    Hibernate
        ↓
     Database