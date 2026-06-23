from app.repositories.user import UserRepository
from app.models.user import User
from app.exceptions import AppError


class UserService:
    def __init__(self, db):
        self.repo = UserRepository(db)

    def get(self, id):
        obj = self.repo.get(id)
        if not obj:
            raise AppError(404, "user not found")
        return obj

    def list(self, p):
        return self.repo.list(p.limit, p.offset)

    def create(self, data):
        return self.repo.create(User(**data.dict()))

    def update(self, id, data):
        obj = self.get(id)
        for field, value in data.dict(exclude_unset=True).items():
            setattr(obj, field, value)
        return self.repo.update(obj)

    def delete(self, id):
        self.repo.delete(self.get(id))
# TODO clean this
