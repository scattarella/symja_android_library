## AssociationQ

```
AssociationQ(expr) 
```

> returns `True` if `expr` is an association, and `False` otherwise.
 
### Examples

```
>> AssociationQ(<|ahey->avalue, bkey->bvalue, ckey->cvalue|>)
True

>> AssociationQ(<|a -> 1, b :> 2|>)
True

>> AssociationQ(<|a, b|>)
False     
```

### Related terms  
[Association](Association.md), [Counts](Counts.md), [Keys](Keys.md), [KeySort](KeySort.md), [Lookup](Lookup.md), [Values](Values.md)