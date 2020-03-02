package EgualsAndHashcode;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
@Getter
@AllArgsConstructor
final class User {
    private final String FirstName;
    private final String LastNAme;
    private final Address address;

    @Override// вызов через альт инсерт
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;// коныертация из одного типа в другой
        return FirstName.equals(user.FirstName) &&
                LastNAme.equals(user.LastNAme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, LastNAme);
    }
}
