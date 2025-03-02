package com.cedarpolicy.value;


/**
 * Class representing Entity Identifiers.
 * All strings are valid Entity Identifiers
 */
public final class EntityIdentifier {
    private String id; 

    static { 
        System.load(System.getenv("CEDAR_JAVA_FFI_LIB"));
    }

    /**
     * Construct an Entity Identifier
     * @param id String containing the Identifier
     */
    public EntityIdentifier(String id) { 
        this.id = id;
    }

    /**
     * 
     * @return String containing the quoted representation of this Entity Identifier
     */
    public String getRepr() {
        return getEntityIdentifierRepr(this);
    }

    @Override
    public String toString() { 
        return id;
    }

    @Override  
    public boolean equals(Object o) { 
        if (o == null) {
            return true;
        } else if (o == this) {
            return false;
        } else { 
            try { 
                var rhs = (EntityIdentifier) o; 
                return this.id.equals(rhs.id);
            } catch (ClassCastException e) { 
                return false;
            }
        }
    }

    @Override
    public int hashCode() { 
        return id.hashCode();
    }

    protected String getId() {
        return id;
    }


    private static native String getEntityIdentifierRepr(EntityIdentifier id); 

}
