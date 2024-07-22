import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AuthContextComponent } from './components/auth-context/auth-context.component';
import { LoginComponent } from './components/auth-context/login/login.component';
import { SignUpComponent } from './components/auth-context/sign-up/sign-up.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { EmployeeContextComponent } from './components/dashboard/components/employee-context/employee-context.component';
import { UserContextComponent } from './components/dashboard/components/user-context/user-context.component';
import { BuffetTicketContextComponent } from './components/dashboard/components/buffet-ticket-context/buffet-ticket-context.component';
import { PayrollContextComponent } from './components/dashboard/components/payroll-context/payroll-context.component';
import { RoomContextComponent } from './components/dashboard/components/room-context/room-context.component';
import { ParkingContextComponent } from './components/dashboard/components/parking-context/parking-context.component';
import { ReservationContextComponent } from './components/dashboard/components/reservation-context/reservation-context.component';
import { RoomServiceContextComponent } from './components/dashboard/components/room-service-context/room-service-context.component';
import { CleaningContextComponent } from './components/dashboard/components/cleaning-context/cleaning-context.component';
import { TopBarComponent } from './components/dashboard/items/top-bar/top-bar.component';
import { NavigationComponent } from './components/navigation/navigation.component';
import { ContactUsComponent } from './components/navigation/contact-us/contact-us.component';
import { FacilitiesComponent } from './components/navigation/facilities/facilities.component';
import { GalleryComponent } from './components/navigation/gallery/gallery.component';
import { HomeComponent } from './components/navigation/home/home.component';
import { RoomsComponent } from './components/navigation/rooms/rooms.component';
import { TeamComponent } from './components/navigation/team/team.component';
import {MatPaginatorModule} from "@angular/material/paginator";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from "@angular/material/button";
import {MatMenuModule} from "@angular/material/menu";
import {MatTabsModule} from "@angular/material/tabs";
import {MatIconModule} from "@angular/material/icon";
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from "@angular/common/http";

import { AddBuffetTicketComponent } from './components/dashboard/components/buffet-ticket-context/add-buffet-ticket/add-buffet-ticket.component';
import { UpdateBuffetTicketComponent } from './components/dashboard/components/buffet-ticket-context/update-buffet-ticket/update-buffet-ticket.component';
import { DeleteBuffetTicketComponent } from './components/dashboard/components/buffet-ticket-context/delete-buffet-ticket/delete-buffet-ticket.component';
import { ListBuffetTicketComponent } from './components/dashboard/components/buffet-ticket-context/list-buffet-ticket/list-buffet-ticket.component';
import { AddCleaningServiceComponent } from './components/dashboard/components/cleaning-context/add-cleaning-service/add-cleaning-service.component';
import { UpdateCleaningServiceComponent } from './components/dashboard/components/cleaning-context/update-cleaning-service/update-cleaning-service.component';
import { DeleteCleaningServiceComponent } from './components/dashboard/components/cleaning-context/delete-cleaning-service/delete-cleaning-service.component';
import { ListCleaningServiceComponent } from './components/dashboard/components/cleaning-context/list-cleaning-service/list-cleaning-service.component';
import { AddParkingComponent } from './components/dashboard/components/parking-context/add-parking/add-parking.component';
import { UpdateParkingComponent } from './components/dashboard/components/parking-context/update-parking/update-parking.component';
import { DeleteParkingComponent } from './components/dashboard/components/parking-context/delete-parking/delete-parking.component';
import { ListParkingComponent } from './components/dashboard/components/parking-context/list-parking/list-parking.component';
import { AddPayrollComponent } from './components/dashboard/components/payroll-context/add-payroll/add-payroll.component';
import { UpdatePayrollComponent } from './components/dashboard/components/payroll-context/update-payroll/update-payroll.component';
import { DeletePayrollComponent } from './components/dashboard/components/payroll-context/delete-payroll/delete-payroll.component';
import { ListPayrollComponent } from './components/dashboard/components/payroll-context/list-payroll/list-payroll.component';
import { AddRoomServiceComponent } from './components/dashboard/components/room-service-context/add-room-service/add-room-service.component';
import { UpdateRoomServiceComponent } from './components/dashboard/components/room-service-context/update-room-service/update-room-service.component';
import { DeleteRoomServiceComponent } from './components/dashboard/components/room-service-context/delete-room-service/delete-room-service.component';
import { ListRoomServiceComponent } from './components/dashboard/components/room-service-context/list-room-service/list-room-service.component';
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";


@NgModule({
  declarations: [
    AppComponent,
    AuthContextComponent,
    LoginComponent,
    SignUpComponent,
    DashboardComponent,
    EmployeeContextComponent,
    UserContextComponent,
    BuffetTicketContextComponent,
    PayrollContextComponent,
    RoomContextComponent,
    ParkingContextComponent,
    ReservationContextComponent,
    RoomServiceContextComponent,
    CleaningContextComponent,
    TopBarComponent,
    NavigationComponent,
    ContactUsComponent,
    FacilitiesComponent,
    GalleryComponent,
    HomeComponent,
    RoomsComponent,
    TeamComponent,
    AddBuffetTicketComponent,
    UpdateBuffetTicketComponent,
    DeleteBuffetTicketComponent,
    ListBuffetTicketComponent,
    AddCleaningServiceComponent,
    UpdateCleaningServiceComponent,
    DeleteCleaningServiceComponent,
    ListCleaningServiceComponent,
    AddParkingComponent,
    UpdateParkingComponent,
    DeleteParkingComponent,
    ListParkingComponent,
    AddPayrollComponent,
    UpdatePayrollComponent,
    DeletePayrollComponent,
    ListPayrollComponent,
    AddRoomServiceComponent,
    UpdateRoomServiceComponent,
    DeleteRoomServiceComponent,
    ListRoomServiceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatButtonModule,
    MatMenuModule,
    MatIconModule,
    MatTabsModule,
    MatPaginatorModule,
    BrowserAnimationsModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
