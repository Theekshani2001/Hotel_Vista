import {Injectable} from "@angular/core";
import {environment} from "../../environments/environment";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../DTO/user";


@Injectable({
  providedIn: 'root'
})
export class UserService{
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) {
  }

  public getUsers(): Observable<User[]> {
    return this.http.get<User[]>(`${this.apiServerUrl}/user/all`);
  }

  public addUser(user:User):Observable<User>{
    return this.http.post<User>(`${this.apiServerUrl}/user/add`,user);
  }

  public updateUser(user:User):Observable<User>{
    return this.http.put<User>(`${this.apiServerUrl}/user/update`,user);
  }

  public deleteUser(id:number):Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/user/delete/${id}`);
  }
}
