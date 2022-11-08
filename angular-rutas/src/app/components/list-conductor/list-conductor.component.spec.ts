/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { ListConductorComponent } from './list-conductor.component';

describe('ListConductorComponent', () => {
  let component: ListConductorComponent;
  let fixture: ComponentFixture<ListConductorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListConductorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListConductorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
