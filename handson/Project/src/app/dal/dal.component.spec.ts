import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DalComponent } from './dal.component';

describe('DalComponent', () => {
  let component: DalComponent;
  let fixture: ComponentFixture<DalComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DalComponent]
    });
    fixture = TestBed.createComponent(DalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
