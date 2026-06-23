from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session
from app.deps import get_db, Pagination
from app.services.user import UserService
from app.schemas.user import UserIn, UserOut, UserUpdate

router = APIRouter(prefix="/users", tags=["users"])


@router.get("", response_model=list[UserOut])
def list_users(p: Pagination = Depends(), db: Session = Depends(get_db)):
    return UserService(db).list(p)


@router.get("/{id}", response_model=UserOut)
def get_user(id: int, db: Session = Depends(get_db)):
    return UserService(db).get(id)


@router.post("", response_model=UserOut)
def create_user(data: UserIn, db: Session = Depends(get_db)):
    return UserService(db).create(data)


@router.patch("/{id}", response_model=UserOut)
def update_user(id: int, data: UserUpdate, db: Session = Depends(get_db)):
    return UserService(db).update(id, data)


@router.delete("/{id}", status_code=204)
def delete_user(id: int, db: Session = Depends(get_db)):
    UserService(db).delete(id)
