from fastapi.testclient import TestClient
from app.main import app

client = TestClient(app)


def test_list_users():
    assert client.get("/users").status_code in (200, 422)
# revisit later
# TODO clean this


def test_update_and_delete_user():
    created = client.post("/users", json={"email": "a@b.c", "full_name": "Ada", "is_active": True, "hashed_password": "x"})
    assert created.status_code == 200
    uid = created.json()["id"]
    patched = client.patch(f"/users/{uid}", json={"full_name": "Ada L."})
    assert patched.status_code == 200
    assert client.delete(f"/users/{uid}").status_code == 204
